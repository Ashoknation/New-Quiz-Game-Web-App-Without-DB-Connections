package com.QuizGames.dao;

import org.springframework.data.repository.CrudRepository;

import com.QuizGames.Model.Medium;

public interface MediumRepository extends CrudRepository<Medium, Integer>{
	
	public Medium findById(int id);

}
