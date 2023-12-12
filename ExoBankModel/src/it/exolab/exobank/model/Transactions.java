package it.exolab.exobank.model;

import java.io.Serializable;
import java.util.Date;

public class Transactions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionID;
    private Date transactionDate;
    private double amount;
    private TransactionType transactionTypeID;
    private TransactionStatus transactionStatusID;
    private BankAccount bankAccountID;
    private BankAccount targetBankAccountID;
	public Integer getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionType getTransactionTypeID() {
		return transactionTypeID;
	}
	public void setTransactionTypeID(TransactionType transactionTypeID) {
		this.transactionTypeID = transactionTypeID;
	}
	public TransactionStatus getTransactionStatusID() {
		return transactionStatusID;
	}
	public void setTransactionStatusID(TransactionStatus transactionStatusID) {
		this.transactionStatusID = transactionStatusID;
	}
	public BankAccount getBankAccountID() {
		return bankAccountID;
	}
	public void setBankAccountID(BankAccount bankAccountID) {
		this.bankAccountID = bankAccountID;
	}
	public BankAccount getTargetBankAccountID() {
		return targetBankAccountID;
	}
	public void setTargetBankAccountID(BankAccount targetBankAccountID) {
		this.targetBankAccountID = targetBankAccountID;
	}
    
    
}
