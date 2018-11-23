package com.cenfotec.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.exam.domain.Finca;

public interface FincaRepository  extends MongoRepository<Finca, String> {
}