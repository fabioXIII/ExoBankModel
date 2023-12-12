package it.exolab.exobank.mapper;

import java.util.List;


import it.exolab.exobank.model.Transactions;
import it.exolab.exobank.model.UserTransactions;

public interface TransactionsMapper {
	
	public List<Transactions> findAllTransactions();
    public void updateTransactionStatus(Transactions s);
    public void insertTransaction ( Transactions t );
    public List<Transactions> findUserTransactions(Integer bankAccountId);
    public List<UserTransactions> findUserTransactions2(Integer bankId);
}
