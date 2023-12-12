package it.exolab.exobank.model;

import java.util.Date;

public class UserTransactions {
	  private Integer transactionId;
	    private Date transactionDate;
	    private Double amount;
	    private Long transactionTypeId;
	    private String transactionStatusName;
	    private String transactionTypeName;
	    private Integer targetBankAccountId;
	    private Integer bankAccountId;
	    private String accountNumber;
	    private Double balance;
	    private Integer accountStatusId;
	    private Integer userId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private Integer roleId;
	    private String taxId;
		public Integer getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(Integer transactionId) {
			this.transactionId = transactionId;
		}
		public Date getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public Long getTransactionTypeId() {
			return transactionTypeId;
		}
		public void setTransactionTypeId(Long transactionTypeId) {
			this.transactionTypeId = transactionTypeId;
		}
		public String getTransactionStatusName() {
			return transactionStatusName;
		}
		public void setTransactionStatusName(String transactionStatusName) {
			this.transactionStatusName = transactionStatusName;
		}
		public String getTransactionTypeName() {
			return transactionTypeName;
		}
		public void setTransactionTypeName(String transactionTypeName) {
			this.transactionTypeName = transactionTypeName;
		}
		public Integer getBankAccountId() {
			return bankAccountId;
		}
		public void setBankAccountId(Integer bankAccountId) {
			this.bankAccountId = bankAccountId;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
		}
		public Integer  getAccountStatusId() {
			return accountStatusId;
		}
		public void setAccountStatusId(Integer accountStatusId) {
			this.accountStatusId = accountStatusId;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Integer getRoleId() {
			return roleId;
		}
		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}
		public String getTaxId() {
			return taxId;
		}
		public void setTaxId(String taxId) {
			this.taxId = taxId;
		}
		public Integer getTargetBankAccountId() {
			return targetBankAccountId;
		}
		public void setTargetBankAccountId(Integer targetBankAccountId) {
			this.targetBankAccountId = targetBankAccountId;
		}

}
