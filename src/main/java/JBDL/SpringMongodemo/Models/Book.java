package JBDL.SpringMongodemo.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book
{
  public Book() {
  }

  //No need of id as it is using NoSQL DB
  private String name;
  private String authorName;
  private Integer cost;

  public Book(String name, String authorName, Integer cost) {
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
