package com.example.qcm_gen.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class QuestionsExamenPK implements Serializable {
    private int idQuestion;
    private int idExamen;

    @Column(name = "id_question", nullable = false)
    @Id
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Column(name = "id_examen", nullable = false)
    @Id
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
        QuestionsExamenPK that = (QuestionsExamenPK) o;
        return idQuestion == that.idQuestion &&
                idExamen == that.idExamen;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idQuestion, idExamen);
    }
}
