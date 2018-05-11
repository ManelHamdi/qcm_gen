package com.example.qcm_gen.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Questions {
    private int idQuestion;
    private int idModule;
    private String question;
    private boolean cm;
    private String explicationReponse;
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private int nbPoints;
    private String bonneReponses;
    private Modules modulesByIdModule;
    private Collection<QuestionsExamen> questionsExamenByIdQuestion;

    @Id
    @Column(name = "id_question", nullable = false)
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Basic
    @Column(name = "id_module", nullable = false)
    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    @Basic
    @Column(name = "question", nullable = false, length = -1)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "cm", nullable = false)
    public boolean isCm() {
        return cm;
    }

    public void setCm(boolean cm) {
        this.cm = cm;
    }

    @Basic
    @Column(name = "explication_reponse", nullable = true, length = -1)
    public String getExplicationReponse() {
        return explicationReponse;
    }

    public void setExplicationReponse(String explicationReponse) {
        this.explicationReponse = explicationReponse;
    }

    @Basic
    @Column(name = "reponse1", nullable = true, length = -1)
    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    @Basic
    @Column(name = "reponse2", nullable = true, length = -1)
    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    @Basic
    @Column(name = "reponse3", nullable = true, length = -1)
    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    @Basic
    @Column(name = "reponse4", nullable = true, length = -1)
    public String getReponse4() {
        return reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    @Basic
    @Column(name = "nb_points", nullable = false)
    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    @Basic
    @Column(name = "bonne_reponses", nullable = false, length = 4)
    public String getBonneReponses() {
        return bonneReponses;
    }

    public void setBonneReponses(String bonneReponses) {
        this.bonneReponses = bonneReponses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questions questions = (Questions) o;
        return idQuestion == questions.idQuestion &&
                idModule == questions.idModule &&
                cm == questions.cm &&
                nbPoints == questions.nbPoints &&
                Objects.equals(question, questions.question) &&
                Objects.equals(explicationReponse, questions.explicationReponse) &&
                Objects.equals(reponse1, questions.reponse1) &&
                Objects.equals(reponse2, questions.reponse2) &&
                Objects.equals(reponse3, questions.reponse3) &&
                Objects.equals(reponse4, questions.reponse4) &&
                Objects.equals(bonneReponses, questions.bonneReponses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idQuestion, idModule, question, cm, explicationReponse, reponse1, reponse2, reponse3, reponse4, nbPoints, bonneReponses);
    }

    @ManyToOne
    @JoinColumn(name = "id_module", referencedColumnName = "id_module", nullable = false, insertable = false, updatable = false)
    public Modules getModulesByIdModule() {
        return modulesByIdModule;
    }

    public void setModulesByIdModule(Modules modulesByIdModule) {
        this.modulesByIdModule = modulesByIdModule;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "questionsByIdQuestion")
    public Collection<QuestionsExamen> getQuestionsExamenByIdQuestion() {
        return questionsExamenByIdQuestion;
    }

    public void setQuestionsExamenByIdQuestion(Collection<QuestionsExamen> questionsExamenByIdQuestion) {
        this.questionsExamenByIdQuestion = questionsExamenByIdQuestion;
    }
}
