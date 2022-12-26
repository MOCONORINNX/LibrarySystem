package com.example.LibrarySystem.repository;

import com.example.LibrarySystem.repository.entities.Book;
import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepo extends CrudRepository<Book, Long> {
Optional <Book> findById(Id id);
}
