package it.exolab.exobank.crud;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.exolab.exobank.mapper.UserMapper;
import it.exolab.exobank.model.Role;
import it.exolab.exobank.model.User;
import it.exolab.exobank.mybatis.SQLMapFactory;

public class UserCrud {

	private static UserCrud instance;

	private UserCrud() {
	}

	public static UserCrud getInstance() {
		if (instance == null) {
			instance = new UserCrud();
		}
		
		return instance;
	}

	public List<User> findAllUser(SQLMapFactory factory) {
		List<User> listaUser = null;
		UserMapper mapper = factory.getMapper(UserMapper.class);
		listaUser = mapper.findAllUser();
		
		return listaUser;

	}
	
	public void insertUser(User user ,SQLMapFactory factory) {
		UserMapper mapper =  factory.getMapper(UserMapper.class);
		
		mapper.insertUser(user);
		factory.commitSession();
	}
	
	public User findByEmailPassword(User user, SQLMapFactory factory) {
		UserMapper mapper =  factory.getMapper(UserMapper.class);
		User u = mapper.findByEmailPassword(user);
		return u;
	}
	public void updateUser(User user, SQLMapFactory factory) {
		UserMapper mapper =  factory.getMapper(UserMapper.class);
        mapper.updateUser(user);
        factory.commitSession();

	}
}