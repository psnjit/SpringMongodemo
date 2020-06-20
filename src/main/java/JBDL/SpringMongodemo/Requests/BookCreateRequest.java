package JBDL.SpringMongodemo.Requests;

public class BookCreateRequest
{
  private String name;
  private String authorName;
  private Integer cost;

  public BookCreateRequest(String name, String authorName, Integer cost) {
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
