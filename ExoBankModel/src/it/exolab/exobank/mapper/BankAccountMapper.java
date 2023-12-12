package it.exolab.exobank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import it.exolab.exobank.model.BankAccount;

public interface BankAccountMapper {
	
	public List <BankAccount> findAllBankAccount();
	
	public void updateBankAccountBalance(@Param("bankAccountId") Integer bankAccountId, 
            @Param("newBalance") Double newBalance);
	
	public void insertBankAccount(BankAccount b);
	
	public BankAccount findBankAccountByUserId(Integer id);

	public void updateBankAccountStatus(BankAccount b);
	
	public BankAccount findBankAccountById(Integer id);
}
