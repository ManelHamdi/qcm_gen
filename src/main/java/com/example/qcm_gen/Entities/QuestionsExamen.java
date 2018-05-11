package com.example.qcm_gen.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "questions_examen", schema = "qcm_gen", catalog = "")
@IdClass(QuestionsExamenPK.class)
public class QuestionsExamen {
    private int idQuestion;
    private int idExamen;
    private Questions questionsByIdQuestion;
    private Examens examensByIdExamen;

    @Id
    @Column(name = "id_question", nullable = false)
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Id
    @Column(name = "id_examen", nullable = false)
    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionsExamen that = (QuestionsExamen) o;
        return idQuestion == that.idQuestion &&
                idExamen == that.idExamen;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idQuestion, idExamen);
    }

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id_question", nullable = false, insertable = false, updatable = false)
    public Questions getQuestionsByIdQuestion() {
        return questionsByIdQuestion;
    }

    public void setQuestionsByIdQuestion(Questions questionsByIdQuestion) {
        this.questionsByIdQuestion = questionsByIdQuestion;
    }

    @ManyToOne
    @JoinColumn(name = "id_examen", referencedColumnName = "id_examen", nullable = false, insertable = false, updatable = false)
    public Examens getExamensByIdExamen() {
        return examensByIdExamen;
    }

    public void setExamensByIdExamen(Examens examensByIdExamen) {
        this.examensByIdExamen = examensByIdExamen;
    }
}
