/**
 * 
 */
package com.bookstore.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bookstore.author.Author;
import com.bookstore.book.model.Book;
import com.bookstore.book.respository.BookCrud;
import com.bookstore.common.enums.UserEnum;
import com.bookstore.user.User;

/**
 * @author Kang
 *
 */
@Service
public class BookService {

	@Autowired
	Book book;

	@Autowired
	BookCrud bookRepo;

	// get book based on isbn
	public Book getBook(String id) {
		return bookRepo.getById(id);
	}

	// adding of new book
	public Book addBook(Book book) {
		Book newBook = new Book();

		newBook = book;

		return bookRepo.save(newBook);
	}

	// updating of book(Single)
	public Book updateBook(Book book) {
		Book currBook = this.getBook(book.getIsbn());

		if (currBook.getPrice() != book.getPrice()) {
			currBook.setPrice(book.getPrice());
		}

		if (!currBook.getGenre().equals(book.getGenre())) {
			currBook.setGenre(book.getGenre());
		}

		return bookRepo.saveAndFlush(currBook);
	}

	public List<Book> listOfBooks(String option, String value) throws Exception {
		// Since its a poc i will keep to jpa repo context and work around it
		List<Book> books = bookRepo.findAll();
		List<Book> returnBookList = new ArrayList<>();

		if (StringUtils.isEmpty(option)) {
			throw new Exception("option cannot be null");
		} else {
			switch (option) {
			case "title":
				for (Book book : books) {
					if (book.getTitle().equals(value)) {
						returnBookList.add(book);
					}

				}
				break;
			case "author":
				for (Book book : books) {
					for (Author author : book.getAuthors()) {
						if (author.getName().equals(value)) {
							returnBookList.add(book);
						}
					}

				}
				break;
			default:
				throw new Exception("no books found under title / author");

			}

		}

		return returnBookList;

	}

	// delete function
	public void deleteBook(String isbn, User user) throws Exception {
		if(!StringUtils.isEmpty(user.getRole())){
			if(user.getRole().equals(UserEnum.ADMIN.toString())){
				bookRepo.delete(bookRepo.getById(isbn));
			}
		}else {
			throw new Exception("User does not have permission to delete book record");
		}
	}

}
