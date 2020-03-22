package org.java.dao;

import java.sql.Date;
import java.util.List;

import org.java.model.bookDetails;
import org.java.model.bookDetails2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DataRepository1 extends JpaRepository<bookDetails2,Integer> {
	
	@Query("SELECT book from bookDetails book JOIN bookDetails2 book2 ON book.isbn=book2.isbn WHERE book.title like %?1% AND book.author like %?2% AND book2.category=?3 and book.isbn=?4")
	public List<bookDetails> findAdvanced(String bookName, String author, String category, int isbn, Date published);
	

}
