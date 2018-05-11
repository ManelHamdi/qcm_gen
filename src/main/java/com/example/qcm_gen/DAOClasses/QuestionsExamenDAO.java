package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IQuestionsExamenDAO;
import com.example.qcm_gen.Entities.QuestionsExamen;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsExamenDAO extends GenericDAO<QuestionsExamen, Integer> implements IQuestionsExamenDAO {
}
