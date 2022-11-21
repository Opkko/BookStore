package com.bookstore.BookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/bookstore")
public class BookStoreApiApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(BookStoreApiApplication.class, args);
	}

}
