/**
 * 
 */
package com.bookstore.user;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author lmkan
 *
 */
@Entity
@Table(name = "USER")
public class User {
	String uid; // user id
	String role; // admin or user for deletion
	
	
	
	/**
	 * 
	 */
	public User() {
	}
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
