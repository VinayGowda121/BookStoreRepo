package org.java.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.java.controller.bookSearchController;
import org.java.dao.DataRepository;
import org.java.model.bookDetails;
import org.java.utils.searchCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class bookSearchService implements bookSearchController {

	@Autowired
	DataRepository repository;

	@Autowired
	searchCache cache;

	@Override
	public String bookSearch() {

		return "search";
	}

	@Override
	public String advancedSearch() {

		return "advancedSearch";
	}

	@Override
	public String searchResult(String bookName, String author, Model model) {

		if (bookName.isEmpty() && author.isEmpty()) {
			List<bookDetails> data = repository.findAll();
			cache.setList(data);
			model.addAttribute("data", data);
		}

		else {

			if (cache.getSize() != 0) {
				if(bookName.length() != 0){
				Set<bookDetails> temp = cache.getList();
				Set<bookDetails> temp1 = temp.stream()
						.filter((x) -> x.getTitle().contains(bookName))
						.collect(Collectors.toSet());
				model.addAttribute("data", temp1);
				}
				
				else{
					Set<bookDetails> temp = cache.getList();
					Set<bookDetails> temp1 = temp.stream()
							.filter((x) -> x.getAuthor().contains(author))
							.collect(Collectors.toSet());
					model.addAttribute("data", temp1);
					
					}
			}

			else {
				if (bookName.length() != 0) {
					List<bookDetails> searchbyName = (List<bookDetails>) repository.findBookByName(bookName);
					cache.setList(searchbyName);
					model.addAttribute("data", searchbyName);
				}

				else {
					List<bookDetails> searchbyAuthorName = (List<bookDetails>) repository.findBookByAuthorName(author);
					cache.setList(searchbyAuthorName);
					model.addAttribute("data", searchbyAuthorName);
				}
			}
		}

		return "SearchResult";
	}

	@Override
	public String advancedResult(String bookName, String author, String category, String isbn, String published,
			Model model) {
		
		return "advancedResult";
	}

}
