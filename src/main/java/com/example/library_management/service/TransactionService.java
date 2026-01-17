package com.example.library_management.service;

import com.example.library_management.dto.TransactionDTO;
import com.example.library_management.model.Transaction;

import java.util.List;

public interface TransactionService {

    public List<Transaction> findAll() ;


    public String createTransaction(TransactionDTO transactionDTO);
    public Transaction returnBook(int t_id);
}
