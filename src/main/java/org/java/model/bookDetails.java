package org.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_INVENTORY")
public class bookDetails {

	@Id
	@Column(name = "BOOKID")
	private String bookId;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "ISBN")
	private int isbn;
	@Column(name = "AVAILIBILITY")
	private String availibility;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAvailibility() {
		return availibility;
	}

	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}

	@Override
	public int hashCode() {
		return this.title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		bookDetails ob = (bookDetails) obj;
		return ob.title.equals(this.title);

	}

}
