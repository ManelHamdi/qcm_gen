package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IQuestionsExamenPKDAO;
import com.example.qcm_gen.Entities.QuestionsExamenPK;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsExamenPKDAO extends GenericDAO<QuestionsExamenPK, Integer> implements IQuestionsExamenPKDAO {
}
