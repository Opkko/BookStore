/**
 * 
 */
package com.bookstore.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.book.model.Book;
import com.bookstore.book.service.BookService;
import com.bookstore.user.User;

/**
 * @author Kang
 *
 */
@RestController("/bookstore")
public class BookStoreController {
	
	@Autowired
	BookService bookService;
	
	// getting book 
    @GetMapping("/getBook/{id}")
    public ResponseEntity<Book> getBook(@PathVariable(value = "id") String id) {
        
        try { 
        	Book book = bookService.getBook(id);
        	return ResponseEntity.ok(book);
        }
        catch (Exception e) {
        	// for scalability can change to logging using apache
        	System.out.println(e.getMessage());
        }
		return ResponseEntity.notFound().build();
            
        
    }
    
	// adding book 
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        
        try { 
        	Book book2 = bookService.addBook(book);
        	return ResponseEntity.ok(book2);
        }
        catch (Exception e) {
        	// for scalability can change to logging using apache
        	System.out.println(e.getMessage());
        }
		return ResponseEntity.notFound().build();
            
        
    }
	
	// update book 
    @PostMapping("/saveBook")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        
        try { 
        	Book book2 = bookService.updateBook(book);
        	return ResponseEntity.ok(book2);
        }
        catch (Exception e) {
        	// for scalability can change to logging using apache
        	System.out.println(e.getMessage());
        }
		return ResponseEntity.notFound().build();
            
        
    }
    
	// delete book 
    @PostMapping("/deleteBook")
    public ResponseEntity<Book> saveBook(@RequestBody String isbn, User user) {
        
        try { 
        	bookService.deleteBook(isbn, user);
        	return ResponseEntity.ok().build();
        }
        catch (Exception e) {
        	// for scalability can change to logging using apache
        	System.out.println(e.getMessage());
        }
		return ResponseEntity.notFound().build();
            
        
    }
    
	// get book 
    @PostMapping("/listBook")
    public ResponseEntity<List<Book>> saveBook(@RequestBody String option, String value) {
        
        try { 
        	List<Book> books = bookService.listOfBooks(option, value);
        	return ResponseEntity.ok(books);
        }
        catch (Exception e) {
        	// for scalability can change to logging using apache
        	System.out.println(e.getMessage());
        }
		return ResponseEntity.notFound().build();
            
        
    }
}
