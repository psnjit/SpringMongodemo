package JBDL.SpringMongodemo.Response;

import JBDL.SpringMongodemo.Models.Book;

public class BookResponse
{
  private String name;
  private String authorName;
  private Integer cost;

  public BookResponse(Book book) {
    this.name = book.getName();
    this.authorName = book.getAuthorName();
    this.cost = book.getCost();
  }

  public BookResponse() {
  }

  public BookResponse(String name, String authorName, Integer cost) {
    this.name = name;
    this.authorName = authorName;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }
}
