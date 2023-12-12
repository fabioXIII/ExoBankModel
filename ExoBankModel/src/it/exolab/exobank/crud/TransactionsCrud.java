package it.exolab.exobank.crud;

import java.util.List;

import it.exolab.exobank.mapper.TransactionsMapper;
import it.exolab.exobank.model.Transactions;
import it.exolab.exobank.model.UserTransactions;
import it.exolab.exobank.mybatis.SQLMapFactory;

public class TransactionsCrud {
	private static TransactionsCrud instance;

	private TransactionsCrud() {
	}

	public static TransactionsCrud getInstance() {
		if (instance == null) {
			instance = new TransactionsCrud();
		}
		
		return instance;
	}
	
	public List<Transactions> findAllTransactions(SQLMapFactory factory){
		TransactionsMapper mapper =factory.getMapper(TransactionsMapper.class);
		List<Transactions> transactionsList = mapper.findAllTransactions();
		return transactionsList;
	}
	public void updateTransactionStatus(SQLMapFactory factory, Transactions s) {
		TransactionsMapper mapper =factory.getMapper(TransactionsMapper.class);
		mapper.updateTransactionStatus(s);
		factory.commitSession();
	}
	public void insertTransaction(SQLMapFactory factory , Transactions t) {
		TransactionsMapper mapper =factory.getMapper(TransactionsMapper.class);
		mapper.insertTransaction(t);
		factory.commitSession();
	}
	public List<Transactions> findUserTransactions(SQLMapFactory factory, Integer bankAccountId){
		TransactionsMapper mapper =factory.getMapper(TransactionsMapper.class);
		List<Transactions> transazioniUtente= mapper.findUserTransactions(bankAccountId);
		factory.commitSession();
		return transazioniUtente;
	}
	
	public List<UserTransactions> findUserTransactions2(SQLMapFactory factory , Integer bankId) {
		TransactionsMapper mapper =factory.getMapper(TransactionsMapper.class);
        List<UserTransactions> userTransactions = mapper.findUserTransactions2(bankId);
        factory.commitSession();
		
		return userTransactions;
		
	}

}
