package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.exam.repository.FincaRepository;

@RestController
public class FincaController {
	@Autowired
	private FincaRepository repository;
}
