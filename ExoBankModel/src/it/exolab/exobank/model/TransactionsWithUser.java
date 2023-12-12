package it.exolab.exobank.model;

import java.util.List;

public class TransactionsWithUser {
	
	private List<Transactions> transactionList;
	private User user;
	
	
	
	public List<Transactions> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transactions> transactionList) {
		this.transactionList = transactionList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
