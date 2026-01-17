package com.example.library_management.controller;

import com.example.library_management.dto.TransactionDTO;
import com.example.library_management.model.Student;
import com.example.library_management.model.Transaction;
import com.example.library_management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("/addTransaction")
    public String createTransaction(@RequestBody TransactionDTO transactionDTO){
        return transactionService.createTransaction(transactionDTO);
    }

    @GetMapping("/findAll")
    public List<Transaction> findAll() {
        return transactionService.findAll();

    }
}
