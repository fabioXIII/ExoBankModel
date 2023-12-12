package it.exolab.exobank.mybatis;


import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;

public class SQLMapFactory {

	private final String resource = "mybatis-config.xml";

	private static ThreadLocal<SQLMapFactory> THREAD_LOCAL = new ThreadLocal<SQLMapFactory>() {

		@Override
		protected SQLMapFactory initialValue() {
			return new SQLMapFactory();
		}
	};

	private SqlSessionManager sqlSessionManager;
	private SqlSessionFactory sqlSessionFactory;

	private SqlSession sqlSession;


	public static SQLMapFactory instance() {
		return THREAD_LOCAL.get();
	}

	private SQLMapFactory() {
	}

	private SqlSessionManager getSqlSessionManager() {
		if (instance().sqlSessionManager == null) {
			instance().sqlSessionManager = SqlSessionManager.newInstance(instance().getSqlSessionFactory());
		}

		return instance().sqlSessionManager;
	}

	private SqlSessionFactory getSqlSessionFactory() {

		if (instance().sqlSessionFactory == null) {
			try (Reader reader = Resources.getResourceAsReader(this.resource)) {
				SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
				instance().sqlSessionFactory = builder.build(reader);
			} catch (Exception e) {
				
				throw new RuntimeException("Errore nell'inizializzazione della classe SqlSessionFactory. Causa: " + e);
			}
		}

		return instance().sqlSessionFactory;
	}

	

	public SqlSession openSession() {
		if (instance().sqlSession == null) {
			instance().sqlSession = instance().getSqlSessionFactory().openSession();
		}
		return instance().sqlSession;
	}

	public SqlSession openSessionNoAutoCommit() {
		if (instance().sqlSession == null) {
			instance().sqlSession = instance().getSqlSessionFactory().openSession(false);
		}
		return instance().sqlSession;
	}

	public void commitSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.commit();
		}
	}

	public void closeSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.close();
			instance().sqlSession = null;
		}
	}

	public void rollbackSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.rollback();
		}

	}

	public <T> T getMapper(Class<T> type) {
		if (instance().sqlSession != null) {
			return instance().sqlSession.getMapper(type);
		}
		return null;
	}

	
	public void commitSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.commit();
		}
	}

	public void closeSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.close();
			instance().sqlSessionManager = null;
		}
	}

	public void rollbackSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.rollback();
		}

	}

	

	
	
	

	

	
}
