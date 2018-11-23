package com.cenfotec.exam.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.exam.domain.Productor;

public interface ProductorRepository extends MongoRepository<Productor, String> {
	public List<Productor> findByTitleLike(String word);
}
