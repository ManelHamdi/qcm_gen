package com.example.qcm_gen.Controlleurs;

import com.example.qcm_gen.Entities.Questions;
import com.example.qcm_gen.ModelInterfaces.IQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerQuestion {

    @Autowired
    private IQuestionsService iQuestionsService;

    @GetMapping("/")
    public String ques(ModelMap modelMap) {
        List<Questions> lstq = iQuestionsService.ListQues(1);
        modelMap.put("LstQs", lstq);
        return "Questions/CreateQuestion";
    }

    @PostMapping("/CreerQs")
    public String AjouterQues(ModelMap modelMap,
                              //@RequestParam int idModule,
                              @RequestParam String question,
                              @RequestParam int nbrpoint,
                              @RequestParam String choix,
                              @RequestParam(required = false) String correcte,
                              @RequestParam String proposition1,
                              @RequestParam String proposition2,
                              @RequestParam String proposition3,
                              @RequestParam String proposition4,
                              @RequestParam String propositionc1,
                              @RequestParam String propositionc2,
                              @RequestParam String propositionc3,
                              @RequestParam String propositionc4,
                              @RequestParam(required = false) List<String> correctec) {
        System.out.println("nnnhhhhhhhhhhn");
        String cr = "";
        Questions questions = new Questions();
        questions.setQuestion(question);
        questions.setNbPoints(nbrpoint);
        questions.setCm(Integer.parseInt(choix));
        if (correcte != null) {
            cr = correcte;
            questions.setReponse1(proposition1);
            questions.setReponse2(proposition2);
            questions.setReponse3(proposition3);
            questions.setReponse4(proposition4);
        } else {
            questions.setReponse1(propositionc1);
            questions.setReponse2(propositionc2);
            questions.setReponse3(propositionc3);
            questions.setReponse4(propositionc4);
            for (String inser :
                    correctec) {
                cr = cr.concat(inser);
            }
        }
        questions.setBonneReponses(cr);
        //********************** id module ***********
        questions.setIdModule(1);
        //if (iConteService.ajouter(conte)) {
        if (iQuestionsService.ajouter(questions)) {
            List<Questions> lstQues = iQuestionsService.ListQues(1);
            modelMap.put("LstQs", lstQues);
            System.out.println("jjjjj");
            return "Questions/CreateQuestion";
        }
        System.out.println("nnnn");
        return "Questions/CreateQuestion";
    }


    @RequestMapping(value = "/GererQs", params = "supprimer", method = RequestMethod.POST)
    public String SupprimerQues(@RequestParam int idQs,
                                ModelMap modelMap) {

        Questions questions = iQuestionsService.findbyId(idQs);
        iQuestionsService.deleteQs(questions);
        List<Questions> lstqs = iQuestionsService.ListQues(1);
        modelMap.put("LstQs", lstqs);
        return "Questions/CreateQuestion";

    }


    @RequestMapping(value = "/GererQs", params = "mod", method = RequestMethod.POST)
    public String modQues(@RequestParam int idQs,
                          ModelMap modelMap) {
        Questions questions = iQuestionsService.findbyId(idQs);
        modelMap.put("question", questions.getQuestion());
        modelMap.put("nbrpoint", questions.getNbPoints());
        modelMap.put("rep1", questions.getReponse1());
        modelMap.put("rep2", questions.getReponse2());
        modelMap.put("rep3", questions.getReponse3());
        modelMap.put("rep4", questions.getReponse4());
        if (questions.getCm() == 1) {
            modelMap.put("cm", true);
            modelMap.put("cu", false);
            if (questions.getBonneReponses().contains("1")) {
                modelMap.put("cm1", true);
            }
            if (questions.getBonneReponses().contains("2")) {
                modelMap.put("cm2", true);
            }
            if (questions.getBonneReponses().contains("3")) {
                modelMap.put("cm3", true);
            }
            if (questions.getBonneReponses().contains("4")) {
                modelMap.put("cm4", true);
            }
        } else {
            modelMap.put("cu", true);
            modelMap.put("cm", false);
            if (questions.getBonneReponses().equals("1")) {
                modelMap.put("cu1", true);
            } else if (questions.getBonneReponses().equals("2")) {
                modelMap.put("cu2", true);
            } else if (questions.getBonneReponses().equals("3")) {
                modelMap.put("cu3", true);
            } else if (questions.getBonneReponses().equals("4")) {
                modelMap.put("cu4", true);
            }
        }
        modelMap.put("idQs", questions.getIdQuestion());
        List<Questions> lstqs = iQuestionsService.ListQues(1);
        modelMap.put("LstQs", lstqs);
        return "Questions/ModifierQuestion";

    }

    @RequestMapping(value = "/GererQs", params = "modifier", method = RequestMethod.POST)
    public String ModifierQues(ModelMap modelMap,
                               @RequestParam int idQs,
                               //@RequestParam int idModule,
                               @RequestParam String question,
                               @RequestParam int nbrpoint,
                               @RequestParam String choix,
                               @RequestParam(required = false) String correcte,
                               @RequestParam String proposition1,
                               @RequestParam String proposition2,
                               @RequestParam String proposition3,
                               @RequestParam String proposition4,
                               @RequestParam String propositionc1,
                               @RequestParam String propositionc2,
                               @RequestParam String propositionc3,
                               @RequestParam String propositionc4,
                               @RequestParam(required = false) List<String> correctec) {

        Questions questions = iQuestionsService.findbyId(idQs);
        questions.setQuestion(question);
        questions.setNbPoints(nbrpoint);
        questions.setCm(Integer.parseInt(choix));
        String cr = "";
        if (correcte != null) {
            cr = correcte;
            questions.setReponse4(proposition4);
            questions.setReponse1(proposition1);
            questions.setReponse2(proposition2);
            questions.setReponse3(proposition3);
        } else {
            questions.setReponse2(propositionc2);
            questions.setReponse1(propositionc1);
            questions.setReponse3(propositionc3);
            questions.setReponse4(propositionc4);
            for (String inser :
                    correctec) {
                cr = cr.concat(inser);
            }
        }
        questions.setBonneReponses(cr);
        //***************** id module ***********
        questions.setIdModule(1);
        iQuestionsService.update(questions);
        List<Questions> lstqs = iQuestionsService.ListQues(1);
        modelMap.put("LstQs", lstqs);
        return "Questions/CreateQuestion";
    }

}
