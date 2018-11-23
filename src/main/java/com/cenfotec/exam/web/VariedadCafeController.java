package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.exam.repository.VariedadCafeRepository;

@RestController
public class VariedadCafeController {
	@Autowired
	private VariedadCafeRepository repository;
}
