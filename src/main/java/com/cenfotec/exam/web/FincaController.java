package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cenfotec.exam.repository.FincaRepository;

@Controller
public class FincaController {
	@Autowired
	private FincaRepository repository;
}
