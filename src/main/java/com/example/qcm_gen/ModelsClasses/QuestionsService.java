package com.example.qcm_gen.ModelsClasses;

import com.example.qcm_gen.DAOInterfaces.IQuestionsDAO;
import com.example.qcm_gen.Entities.Questions;
import com.example.qcm_gen.ModelInterfaces.IQuestionsService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class QuestionsService implements IQuestionsService {
    private static SessionFactory sessionFactory;

    static {

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Erreur Dans GenericDAO.SessionFactory : \n" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Autowired
    private IQuestionsDAO iQuestionsDAO;

    @Override
    public Boolean ajouter(Questions questions) {
        return iQuestionsDAO.saveBool(questions);
    }

    @Override
    public List<Questions> ListQues(int idModule) {
        List<Questions> results = null;

        try {
            Session session = sessionFactory.openSession();
            results = session.createQuery("from Questions q where q.idModule = " + idModule + " order by idQuestion DESC ").list();
            session.close();
        } catch (Exception ex) {
            System.err.println("Erreur Dans Questions service find all qs by idmd : \n" + ex.getMessage());
        }
        return results;
    }

    @Override
    public Boolean deleteQs(Questions idQs) {

        try {
            iQuestionsDAO.delete(idQs);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Questions findbyId(int id) {
        return iQuestionsDAO.findById(id);
    }

    @Override
    public Boolean update(Questions ques) {
        try {
            return iQuestionsDAO.update(ques);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
