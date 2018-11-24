package com.cenfotec.exam.web;

import java.util.List;
import java.util.Optional;

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
import com.cenfotec.exam.repository.FincaRepository;
import com.cenfotec.exam.repository.ProductorRepository;

@Controller
public class ProductorController {
	@Autowired
	ProductorRepository repository;
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
	/**
	 * Search productor view
	 */
	@GetMapping("/productor/search")
	public String searchProductor(Model model) {
		model.addAttribute("productor", new Productor());
		return "searchProductor";
	}
	/**
	 * Search productor submit
	 */
	@PostMapping("/productor/search")
	public String findProductor(@ModelAttribute Productor productor) {
		return "redirect:/productor/list/" + productor.getNombre();
	}
	/**
	 * Productor Lista
	 */
	@RequestMapping(value = { "/productor/list", "/productor/list/{nombre}" })
	public String listaProductor(@PathVariable Optional<String> nombre, Model model) {
		List<Productor> productores;
		if (nombre.isPresent()) {
			productores = repository.findByNombreRegexIgnoreCase(".*" + nombre.get() + ".*");
		} else {
			productores = repository.findAll();
		}
		model.addAttribute("productores", productores);
		return "listaProductor";
	}
	/**
	 * View Productor
	 */
	@RequestMapping("/productor/view/{id}")
	public String viewProductor (@PathVariable String id, Model model) {
		Productor productor = repository.findById(id).get();
		Iterable<String> fincasIterable = productor.getFincas();
		if (!productor.getFincas().isEmpty()) {
			Iterable<Finca> fincas = fincaRepository.findAllById(fincasIterable);
			model.addAttribute("fincas", fincas);
		}
		model.addAttribute("productor", productor);
		return "viewProductor";
	}
}
