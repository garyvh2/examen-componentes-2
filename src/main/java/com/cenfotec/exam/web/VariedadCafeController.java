package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenfotec.exam.domain.Finca;
import com.cenfotec.exam.domain.VariedadCafe;
import com.cenfotec.exam.repository.FincaRepository;
import com.cenfotec.exam.repository.VariedadCafeRepository;

@Controller
public class VariedadCafeController {
	@Autowired
	VariedadCafeRepository cafeRepository;
	@Autowired
	FincaRepository fincaRepository;
	/**
	 * Get the Form View
	 */
	@GetMapping("/productor/{productorId}/finca/{fincaId}/cafe")
	public String formCafe(@PathVariable String fincaId, Model model) {
		Finca finca = fincaRepository.findById(fincaId).get();
        model.addAttribute("finca", finca);
		model.addAttribute("cafe", new VariedadCafe());
		return "formCafe";
	}
	/**
	 * Capture the submit action and store the data in the repository
	 */
	@PostMapping("/productor/{productorId}/finca/{fincaId}/cafe")
	public String postCafe(@PathVariable String fincaId, @ModelAttribute VariedadCafe cafe, Model model) {
		cafe = cafeRepository.save(cafe);
		Finca finca = fincaRepository.findById(fincaId).get();
		finca.addCafes(cafe.getId());
		fincaRepository.save(finca);
		model.addAttribute("cafe", cafe);
		return "submittedCafe";
	}
	/**
	 * View Cafe
	 */
	@RequestMapping("/productor/{productorId}/finca/{fincaId}/cafe/view/{cafeId}")
	public String viewCafe (@PathVariable String cafeId, Model model) {
		VariedadCafe cafe = cafeRepository.findById(cafeId).get();
		model.addAttribute("cafe", cafe);
		return "viewCafe";
	}
}
