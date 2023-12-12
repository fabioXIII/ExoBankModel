package it.exolab.exobank.model;

import java.io.Serializable;

public class TransactionType implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer transactionTypeID;
	    private String transactionTypeName;
		public Integer getTransactionTypeID() {
			return transactionTypeID;
		}
		public void setTransactionTypeID(Integer transactionTypeID) {
			this.transactionTypeID = transactionTypeID;
		}
		public String getTransactionTypeName() {
			return transactionTypeName;
		}
		public void setTransactionTypeName(String transactionTypeName) {
			this.transactionTypeName = transactionTypeName;
		}
		
}
