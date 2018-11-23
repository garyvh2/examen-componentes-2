package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenfotec.exam.domain.Productor;
import com.cenfotec.exam.repository.ProductorRepository;

@Controller
public class ProductorController {
	@Autowired
	ProductorRepository repository;
	/**
	 * Index
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	/**
	 * Get the Form View
	 */
	@GetMapping("/productor")
	public String formProductor(Model model) {
        model.addAttribute("productor", new Productor());
		return "formProductor";
	}
	/**
	 * Capture the submit action and store the data in the repository
	 */
	@PostMapping("/productor")
	public String postProductor(@ModelAttribute Productor productor) {
		repository.save(productor);
		return "submittedProductor";
	}
}
