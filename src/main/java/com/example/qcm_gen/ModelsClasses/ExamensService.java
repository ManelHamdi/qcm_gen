package com.example.qcm_gen.ModelsClasses;

import com.example.qcm_gen.DAOInterfaces.IExamensDAO;
import com.example.qcm_gen.Entities.Examens;
import com.example.qcm_gen.ModelInterfaces.IExamensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamensService implements IExamensService {

    @Autowired
    private IExamensDAO iExamensDAO;

    @Override
    public Boolean ajouter(Examens examens) {
        return iExamensDAO.saveBool(examens);
    }
}
