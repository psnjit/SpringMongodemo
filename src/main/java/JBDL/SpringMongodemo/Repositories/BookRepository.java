package JBDL.SpringMongodemo.Repositories;

import JBDL.SpringMongodemo.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BookRepository extends MongoRepository<Book, Integer>
{
public List<Book> findByAuthorName(String authorName);
}
