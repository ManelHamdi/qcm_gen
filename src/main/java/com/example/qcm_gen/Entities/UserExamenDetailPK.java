package com.example.qcm_gen.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UserExamenDetailPK implements Serializable {
    private int idUser;
    private int idExamen;
    private int idQuestion;

    @Column(name = "id_user", nullable = false)
    @Id
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "id_examen", nullable = false)
    @Id
    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    @Column(name = "id_question", nullable = false)
    @Id
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserExamenDetailPK that = (UserExamenDetailPK) o;
        return idUser == that.idUser &&
                idExamen == that.idExamen &&
                idQuestion == that.idQuestion;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, idExamen, idQuestion);
    }
}
