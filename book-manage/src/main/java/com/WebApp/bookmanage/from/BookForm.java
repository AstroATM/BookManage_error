package com.WebApp.bookmanage.from;

import lombok.Data;

@Data
public class BookForm {

  /**
   * 本のタイトルを保持する
   * @return
   */
  private String title;

  /**
   * 本の値段を保持する
   * @return
   */
  private Integer price;
}
