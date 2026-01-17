package com.example.library_management.service.Implementation;

import com.example.library_management.dto.TransactionDTO;
import com.example.library_management.enums.TransactionStatus;
import com.example.library_management.model.Book;
import com.example.library_management.model.Card;
import com.example.library_management.model.Transaction;
import com.example.library_management.repository.BookRepository;
import com.example.library_management.repository.CardRepository;
import com.example.library_management.repository.TransactionRepository;
import com.example.library_management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    CardRepository cardRepository;
@Autowired
private TransactionRepository transactionRepository;
    @Autowired
    private BookRepository bookRepository;

    public String createTransaction(TransactionDTO transactionDTO) {
        Book b = bookRepository.findById(transactionDTO.getBookId()).orElse(null);

        Card c = cardRepository.findById(transactionDTO.getCardId()).orElse(null);
        Transaction t = new Transaction();
        t.setCard(c);
        t.setBook(b);
        t.setTransactionStatus(transactionDTO.getTransactionStatus());
        transactionRepository.save(t);
        return "BOOK ISSUED";
    }

    public List<Transaction> findAll(){
        return transactionRepository.findAll();
    }
}
