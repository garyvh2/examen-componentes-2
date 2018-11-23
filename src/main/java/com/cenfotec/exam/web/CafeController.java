package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cenfotec.exam.domain.Cafe;
import com.cenfotec.exam.repository.CafeRepository;

public class CafeController {
	@Autowired
	CafeRepository cafeRepository;
	
	/**
	 * Get the Form View
	 */
	@GetMapping("/cafe")
	public String formCafe(Model model) {
        model.addAttribute("cafe", new Cafe());
		return "formCafe";
	}
	/**
	 * Capture the submit action and store the data in the repository
	 */
	@PostMapping("/cafe")
	public String postCafe(@ModelAttribute Cafe cafe) {
		cafeRepository.save(cafe);
		return "submittedCafe";
	}
}
