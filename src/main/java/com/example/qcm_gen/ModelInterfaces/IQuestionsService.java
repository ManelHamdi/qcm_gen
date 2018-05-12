package com.example.qcm_gen.ModelInterfaces;

import com.example.qcm_gen.Entities.Questions;

import java.util.List;

public interface IQuestionsService {

    Boolean ajouter(Questions questions);

    List<Questions> ListQues(int idModule);

    Boolean deleteQs(Questions idQs);

    Questions findbyId(int id);

    Boolean update(Questions ques);
}
