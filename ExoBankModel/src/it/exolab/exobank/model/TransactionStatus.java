package it.exolab.exobank.model;

import java.io.Serializable;

public class TransactionStatus implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionStatusID;
    private String transactionStatusName;
	public int getTransactionStatusID() {
		return transactionStatusID;
	}
	public void setTransactionStatusID(Integer transactionStatusID) {
		this.transactionStatusID = transactionStatusID;
	}
	public String getTransactionStatusName() {
		return transactionStatusName;
	}
	public void setTransactionStatusName(String transactionStatusName) {
		this.transactionStatusName = transactionStatusName;
	}
	
    

}
