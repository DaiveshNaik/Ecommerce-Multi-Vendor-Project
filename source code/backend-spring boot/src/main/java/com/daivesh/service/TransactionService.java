package com.daivesh.service;

import com.daivesh.model.Order;
import com.daivesh.model.Seller;
import com.daivesh.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
