package com.example.LibrarySystem.components;

import com.example.LibrarySystem.repository.BookRepo;
import com.example.LibrarySystem.repository.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final BookRepo repo;

    @Autowired
    public DatabaseLoader(BookRepo repo) {
        this.repo = repo;
    }


    @Override
    public void run(String... strings) throws Exception {
        this.repo.save(new Book("Numerical Analysis", "Computer Science", "Book about Numerical Analysis for CSCI 2220 (University Of North Georgia)"));
    }
}

