package com.WebApp.bookmanage.controller;



import com.WebApp.bookmanage.from.BookForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.WebApp.bookmanage.service.BookService;
import com.WebApp.bookmanage.model.Book;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // アノテーションを使って、Controllerクラスであることを宣言
public class BookController {

  @Autowired
  BookService service;

  @GetMapping("/book-list")
  public String bookList(Model model) {

    // serviceを使って、本の一覧をDBから取得する
    List<Book> bookList = service.findAll();
    // modelに本の一覧を設定して、画面に渡す
    model.addAttribute("bookList", bookList);
    // bookList.htmlの表示
    return "bookList";
  }

  /**
   * 新規登録画面を表示
   * @param model
   * @return 新規登録画面
   */
  @GetMapping("/book-create")
  public String createBook(Model model) {

    model.addAttribute("bookForm", new BookForm());

    return "add";
  }

  /**
   * データベースに本を登録する
   * @param bookForm
   * @param model
   * @return
   */
  @PostMapping("/book-create")
  public String saveBook(@ModelAttribute BookForm bookForm, Model model) {

    // 本を登録する
    service.insert(bookForm);

    // 本の一覧表示画面にリダイレクト
    return "redirect:/book-list";
  }
}
