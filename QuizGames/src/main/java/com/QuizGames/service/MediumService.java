package com.QuizGames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.QuizGames.Model.Medium;
import com.QuizGames.dao.MediumRepository;

@Component
public class MediumService {
	@Autowired
	private MediumRepository mediumRepository;
	//get all medium questions
		public List<Medium> getAllmediumQuestion()
		{
			List<Medium> medium=(List<Medium>)this.mediumRepository.findAll();		
			return medium;
		}
		//get medium question by id
		public Medium getmediumQuestion(int id)
		{
			Medium medium=null;
			medium = this.mediumRepository.findById(id);
			return medium;
		}
}
