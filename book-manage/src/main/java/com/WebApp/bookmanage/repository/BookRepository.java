package com.WebApp.bookmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.WebApp.bookmanage.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
