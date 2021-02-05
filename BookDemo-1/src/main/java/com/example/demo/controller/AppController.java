package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;


@Controller
public class AppController {


	@Autowired
	private BookRepository bookRepository;

	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Book> listBooks = bookRepository.findAll();
		model.addAttribute("listBooks", listBooks);
		
		return "index";
	}
	
	@RequestMapping("/saveBook")
	public String showNewBookForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		
		return "createBook";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("book") Book book) {
		bookRepository.save(book);
		
		return "redirect:/";
	}
	
}
