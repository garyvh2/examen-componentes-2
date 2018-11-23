package com.cenfotec.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cenfotec.exam.repository.VariedadCafeRepository;

@Controller
public class VariedadCafeController {
	@Autowired
	private VariedadCafeRepository repository;
}
