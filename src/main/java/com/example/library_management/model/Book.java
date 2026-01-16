package com.example.library_management.model;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;
    private String name;
    private float price;

    @OneToMany
    @JoinColumn
    Author author;
}
