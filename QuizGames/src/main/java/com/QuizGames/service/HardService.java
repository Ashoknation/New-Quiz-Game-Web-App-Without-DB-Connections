package com.QuizGames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.QuizGames.Model.Hard;
import com.QuizGames.dao.HardRepository;

@Component
public class HardService {
		@Autowired
		private HardRepository hardRepository;
		
		//get all Hard questions
		public List<Hard> getAllHardQuestion()
		{
			List<Hard> Hard=(List<Hard>)this.hardRepository.findAll();		
			return Hard;
		}
		//get Hard question by id
		public Hard getHardQuestion(int id)
		{
			Hard Hard=null;
			Hard = this.hardRepository.findById(id);
			return Hard;
		}
}
