/**
 * 
 */
package com.bookstore.author;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Kang
 *
 */
@Entity
@Table(name = "AUTHOR")
public class Author {
	String authorPk;
    String name; // name of Author
    Date birthday;
	/**
	 * @param name
	 * @param birthday
	 */
	public Author(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	
	
	/**
	 * @return the authorPk
	 */
	public String getAuthorPk() {
		return authorPk;
	}



	/**
	 * @param authorPk the authorPk to set
	 */
	public void setAuthorPk(String authorPk) {
		this.authorPk = authorPk;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
    
    
}
