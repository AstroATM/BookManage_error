package com.WebApp.bookmanage.service;

import com.WebApp.bookmanage.from.BookForm;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WebApp.bookmanage.model.Book;
import com.WebApp.bookmanage.repository.BookRepository;

@Service
@Transactional
public class BookService {

  @Autowired
  BookRepository repository;

  /**
   * データベースから本の一覧を取得する
   */
  public List<Book> findAll() {
    return repository.findAll();
  }

  /**
   * データベースにデータを登録する
   */
  public void insert(BookForm bookForm) {
    // データベースに登録する値を保持するインスタンス
    Book book = new Book();

    // 画面から受け取った値をデータベースに保存するインスタンスに渡す
    book.setTitle(bookForm.getTitle());
    book.setPrice(bookForm.getPrice());

    // データベースに登録する
    repository.save(book);
  }

}
