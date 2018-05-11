package com.example.qcm_gen.DAOClasses;

import com.example.qcm_gen.DAOInterfaces.IExamensDAO;
import com.example.qcm_gen.Entities.Examens;
import org.springframework.stereotype.Repository;

@Repository
public class ExamensDAO extends GenericDAO<Examens, Integer> implements IExamensDAO {
}
