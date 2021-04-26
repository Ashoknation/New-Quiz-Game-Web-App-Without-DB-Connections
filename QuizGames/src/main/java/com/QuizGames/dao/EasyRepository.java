package com.QuizGames.dao;

import org.springframework.data.repository.CrudRepository;

import com.QuizGames.Model.Easy;

public interface EasyRepository extends CrudRepository<Easy, Integer> {
	
	public Easy findById(int id);

}
