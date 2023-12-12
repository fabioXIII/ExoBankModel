package it.exolab.exobank.mapper;

import it.exolab.exobank.model.AccountStatus;

public interface AccountStatusMapper {
	
	public void updateAccountStatus(AccountStatus a , Integer userID);

}
