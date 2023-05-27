/*
 * package com.QuizGames.service;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import com.QuizGames.Model.Easy; import com.QuizGames.dao.EasyRepository;
 * 
 * @Component public class EasyService {
 * 
 * @Autowired private EasyRepository easyRepository;
 * 
 * //get all easy questions public List<Easy> getAllEasyQuestion() { List<Easy>
 * easy=(List<Easy>)this.easyRepository.findAll(); return easy; } //get easy
 * question by id public Easy getEasyQuestion(int id) { Easy easy=null; easy =
 * this.easyRepository.findById(id); return easy; } }
 */