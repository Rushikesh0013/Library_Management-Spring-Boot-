package com.example.library_management.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "table")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authId;
    private String name;
    private String email;
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)

    List<Book> books=new ArrayList<>();

    public Author(int authId, String name, String email, List<Book> books) {
        this.authId = authId;
        this.name = name;
        this.email = email;
        this.books = books;
    }

    public Author() {
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
