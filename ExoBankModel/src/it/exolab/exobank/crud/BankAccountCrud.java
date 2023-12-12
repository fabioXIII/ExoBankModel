package it.exolab.exobank.crud;

import java.util.List;

import it.exolab.exobank.mapper.BankAccountMapper;
import it.exolab.exobank.model.BankAccount;
import it.exolab.exobank.model.User;
import it.exolab.exobank.mybatis.SQLMapFactory;

public class BankAccountCrud {

	private static BankAccountCrud instance;

	private BankAccountCrud() {
	}

	public static BankAccountCrud getInstance() {
		if (instance == null) {
			instance = new BankAccountCrud();
		}
		
		return instance;
	}
	
	public void insertBankAccount(BankAccount b, SQLMapFactory factory) {
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
		mapper.insertBankAccount(b);
		factory.commitSession();
		
	}
	
	public BankAccount findBankAccountByUserId (Integer id, SQLMapFactory factory) {
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
        BankAccount b =mapper.findBankAccountByUserId(id);
        factory.commitSession();
        return  b;
		
	}
	
	public BankAccount findBankAccountById(Integer id, SQLMapFactory factory) {
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
        BankAccount b = mapper.findBankAccountById(id);
        factory.commitSession();
        return b;
		
		
	}
	
	public List <BankAccount> findAllBankAccount(SQLMapFactory factory){
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
		List<BankAccount> listaUser = mapper.findAllBankAccount();
		factory.commitSession();
		return listaUser;
		
	}
	
	public void updateBankAccountStatus(BankAccount b, SQLMapFactory factory) {
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
		mapper.updateBankAccountStatus(b);
		factory.commitSession();

	}
	
	public void updateBankAccountBalance(Integer bankAccountID, double newBalance, SQLMapFactory factory) {
		BankAccountMapper mapper = factory.getMapper(BankAccountMapper.class);
		mapper.updateBankAccountBalance(bankAccountID, newBalance);
		factory.commitSession();

	}
}
