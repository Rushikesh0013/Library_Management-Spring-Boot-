package com.example.library_management.model;

import com.example.library_management.enums.TransactionStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity

@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;

    @Enumerated(EnumType.STRING)
    TransactionStatus transactionStatus;
    @CreationTimestamp

    private Date issueDate;
    @ManyToOne
    @JoinColumn
    private Card card;

    @ManyToOne
    @JoinColumn
    private Book book;

    private float amount;
    private Date submitDate;

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Transaction(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Transaction(int transactionId, TransactionStatus transactionStatus, Date issueDate, Card card, Book book) {
        this.transactionId = transactionId;
        this.transactionStatus = transactionStatus;
        this.issueDate = issueDate;
        this.card = card;
        this.book = book;
    }

    public Transaction() {
    }

}
