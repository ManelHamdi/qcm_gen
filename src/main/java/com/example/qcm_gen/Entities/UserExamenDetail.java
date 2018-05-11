package com.example.qcm_gen.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_examen_detail", schema = "qcm_gen", catalog = "")
@IdClass(UserExamenDetailPK.class)
public class UserExamenDetail {
    private int idUser;
    private int idExamen;
    private int idQuestion;
    private String reponses;

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Id
    @Column(name = "id_examen", nullable = false)
    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    @Id
    @Column(name = "id_question", nullable = false)
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Basic
    @Column(name = "reponses", nullable = false, length = 4)
    public String getReponses() {
        return reponses;
    }

    public void setReponses(String reponses) {
        this.reponses = reponses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserExamenDetail that = (UserExamenDetail) o;
        return idUser == that.idUser &&
                idExamen == that.idExamen &&
                idQuestion == that.idQuestion &&
                Objects.equals(reponses, that.reponses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, idExamen, idQuestion, reponses);
    }
}
