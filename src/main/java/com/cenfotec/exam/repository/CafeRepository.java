package com.cenfotec.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.exam.domain.Cafe;

public interface CafeRepository  extends MongoRepository<Cafe, String> {
}