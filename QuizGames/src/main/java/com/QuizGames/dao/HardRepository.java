package com.QuizGames.dao;

import org.springframework.data.repository.CrudRepository;

import com.QuizGames.Model.Hard;

public interface HardRepository extends CrudRepository<Hard, Integer> {
	
	public Hard findById(int id);
}
