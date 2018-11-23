package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenfotec.exam.domain.Finca;
import com.cenfotec.exam.repository.FincaRepository;

@Controller
public class FincaController {
	@Autowired
	FincaRepository fincaRepository;
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
	@GetMapping("/finca")
	public String formFinca(Model model) {
        model.addAttribute("finca", new Finca());
		return "formFinca";
	}
	/**
	 * Capture the submit action and store the data in the repository
	 */
	@PostMapping("/finca")
	public String postFinca(@ModelAttribute Finca finca) {
		fincaRepository.save(finca);
		return "submittedFinca";
	}
}
