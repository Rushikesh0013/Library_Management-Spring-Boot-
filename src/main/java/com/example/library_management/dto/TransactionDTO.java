package com.example.library_management.dto;

import com.example.library_management.enums.TransactionStatus;

public class TransactionDTO {
    private int bookId;
    private int cardId;
    private TransactionStatus transactionStatus;

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public TransactionDTO(int cardId, int bookId) {
        this.cardId = cardId;
        this.bookId = bookId;
    }

    public TransactionDTO() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
