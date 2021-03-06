package com.cenfotec.exam.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cenfotec.exam.domain.Productor;

public interface ProductorRepository extends MongoRepository<Productor, String> {
	public List<Productor> findByNombreLike(String word);
    @Query(value = "{'Nombre': {$regex : ?0, $options: 'i'}}")
	public List<Productor> findByNombreRegexIgnoreCase(String word);
}
