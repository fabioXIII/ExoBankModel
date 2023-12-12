package it.exolab.exobank.crud;

import it.exolab.exobank.mapper.AccountStatusMapper;
import it.exolab.exobank.model.AccountStatus;
import it.exolab.exobank.mybatis.SQLMapFactory;

public class AccountStatusCrud {


	private static AccountStatusCrud instance;

	private AccountStatusCrud() {
	}

	public static AccountStatusCrud getInstance() {
		if (instance == null) {
			instance = new AccountStatusCrud();
		}
		
		return instance;
	}
	
	public void updateAccountStatus(AccountStatus a , Integer bankAccountID, SQLMapFactory factory) {
		AccountStatusMapper mapper = factory.getMapper(AccountStatusMapper.class);
		mapper.updateAccountStatus(a, bankAccountID);
		factory.commitSession();
		
	}
}
