package org.java.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public interface bookSearchController {

	
	@RequestMapping(method=RequestMethod.GET,value="/search")
	public String bookSearch();
	
	@RequestMapping(method=RequestMethod.GET,value="/result")
	public String searchResult(@RequestParam String bookName,@RequestParam String author,Model model);
	
	@RequestMapping(method=RequestMethod.GET,value="/advancedSearch")
	public String advancedSearch();
	
	@RequestMapping(method=RequestMethod.GET,value="/advancedResult")
	public String advancedResult(@RequestParam String bookName,@RequestParam String author,@RequestParam String category,@RequestParam String isbn,@RequestParam String published, Model model);
}
