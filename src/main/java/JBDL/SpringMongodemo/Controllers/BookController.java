package JBDL.SpringMongodemo.Controllers;

import JBDL.SpringMongodemo.Models.Book;
import JBDL.SpringMongodemo.Repositories.BookRepository;
import JBDL.SpringMongodemo.Requests.BookCreateRequest;
import JBDL.SpringMongodemo.Response.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController
{
  @Autowired
  BookRepository bookRepository;

  @GetMapping("/books")
  public List<Book> getAllBooks()
  {
    return bookRepository.findAll();
  }

  @PostMapping("/insertBook")
    public void insertBook(@RequestBody BookCreateRequest request)
  {
    Book book= new Book(request.getName(), request.getAuthorName(), request.getCost());
    bookRepository.save(book);
  }

  @GetMapping("/book/{authorName}")
  public List<BookResponse> getBook(@PathVariable(value="authorName")String authorName)
  {
    List<Book> books = bookRepository.findByAuthorName(authorName);
    List<BookResponse> bookResponses = new ArrayList<>(books.size());
    for(Book book: books)
      bookResponses.add(new BookResponse(book));

    return bookResponses;
  }
}
