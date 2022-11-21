/**
 * 
 */
package com.bookstore.book.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.book.model.Book;

/**
 * @author Kang
 *
 */
@Repository
public interface BookCrud extends JpaRepository<Book, String>{

}
