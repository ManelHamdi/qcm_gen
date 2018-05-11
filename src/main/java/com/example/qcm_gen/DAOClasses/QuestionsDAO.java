package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IQuestionsDAO;
import com.example.qcm_gen.Entities.Questions;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsDAO extends GenericDAO<Questions, Integer> implements IQuestionsDAO {
}
