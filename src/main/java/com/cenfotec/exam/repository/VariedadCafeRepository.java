package com.cenfotec.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.exam.domain.VariedadCafe;

public interface VariedadCafeRepository extends MongoRepository<VariedadCafe, String> {
}
