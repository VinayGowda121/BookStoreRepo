package org.java.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.java.model.bookDetails;
import org.springframework.stereotype.Component;

	
@Component
public class searchCache {
	
	Set<bookDetails> cachedList = new HashSet<bookDetails>();
	
	public void setList(List<bookDetails> list){
		cachedList.addAll(list);
	}
	
	public Set<bookDetails> getList(){
		return cachedList;
	}
	
	public int getSize(){
		return cachedList.size();
	}

}
