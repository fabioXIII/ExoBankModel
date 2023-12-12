package it.exolab.exobank.model;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bankAccountID;
    private String accountNumber;
    private double balance;
    private AccountStatus accountStatusID;
    private User userID;
	public Integer getBankAccountID() {
		return bankAccountID;
	}
	public void setBankAccountID(Integer bankAccountID) {
		this.bankAccountID = bankAccountID;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountStatus getAccountStatusID() {
		return accountStatusID;
	}
	public void setAccountStatusID(AccountStatus accountStatusID) {
		this.accountStatusID = accountStatusID;
	}
	public User getUserID() {
		return userID;
	}
	public void setUserID(User userID) {
		this.userID = userID;
	}

	
}