package org.java.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK_INVENTORY2")
public class bookDetails2 {
	
	@Id
	@Column(name="ISBN")
	private int ISBN;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="PUBLISHED")
	private Date published;
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	
	
	
}
