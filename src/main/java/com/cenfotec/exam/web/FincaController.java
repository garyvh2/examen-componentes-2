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
import com.cenfotec.exam.domain.Productor;
import com.cenfotec.exam.domain.VariedadCafe;
import com.cenfotec.exam.repository.FincaRepository;
import com.cenfotec.exam.repository.ProductorRepository;
import com.cenfotec.exam.repository.VariedadCafeRepository;

@Controller
public class FincaController {
	@Autowired
	FincaRepository fincaRepository;
	@Autowired
	ProductorRepository productorRepository;
	@Autowired
	VariedadCafeRepository cafeRepository;
	/**
	 * Get the Form View
	 */
	@GetMapping("/productor/{productorId}/finca")
	public String formFinca(@PathVariable String productorId, Model model) {
		Productor productor = productorRepository.findById(productorId).get();
		model.addAttribute("productor", productor);
        model.addAttribute("finca", new Finca());
		return "formFinca";
	}
	/**
	 * Capture the submit action and store the data in the repository
	 */
	@PostMapping("/productor/{productorId}/finca")
	public String postFinca(@PathVariable String productorId, @ModelAttribute Finca finca, Model model) {
		finca = fincaRepository.save(finca);
		Productor productor = productorRepository.findById(productorId).get();
		productor.addFinca(finca.getId());
		productorRepository.save(productor);
		return "submittedFinca";
	}
	/**
	 * View Finca
	 */
	@RequestMapping("/productor/{productorId}/finca/view/{fincaId}")
	public String viewCafe(@PathVariable String productorId, @PathVariable String fincaId, Model model) {
		Finca finca = fincaRepository.findById(fincaId).get();
		model.addAttribute("productorId", productorId);
		Iterable<String> cafesIterable = finca.getCafes();
		if (!finca.getCafes().isEmpty()) {
			Iterable<VariedadCafe> cafes = cafeRepository.findAllById(cafesIterable);
			model.addAttribute("cafes", cafes);
		}
		model.addAttribute("finca", finca);
		return "viewFinca";
	}
}
