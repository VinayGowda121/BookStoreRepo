package org.java.dao;

import java.util.Collection;
import org.java.model.bookDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface DataRepository extends JpaRepository<bookDetails,String> {
	
	@Transactional(readOnly = true)
	@Cacheable(value="bookDeatils")
	@Query("SELECT book FROM bookDetails book WHERE book.title like %?1%")
	Collection<bookDetails> findBookByName(String bookName);
	
	@Transactional(readOnly = true)
	@Cacheable(value="bookDeatils")
	@Query("SELECT book FROM bookDetails book WHERE book.author like %?1%")
	Collection<bookDetails> findBookByAuthorName(String author);

}
