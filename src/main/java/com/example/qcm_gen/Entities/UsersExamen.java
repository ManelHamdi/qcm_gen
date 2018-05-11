package com.example.qcm_gen.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_examen", schema = "qcm_gen", catalog = "")
@IdClass(UsersExamenPK.class)
public class UsersExamen {
    private int idUser;
    private int idExamen;
    private double score;
    private Users usersByIdUser;
    private Examens examensByIdExamen;

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

    @Basic
    @Column(name = "score", nullable = false, precision = 0)
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersExamen that = (UsersExamen) o;
        return idUser == that.idUser &&
                idExamen == that.idExamen &&
                Double.compare(that.score, score) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, idExamen, score);
    }

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false, insertable = false, updatable = false)
    public Users getUsersByIdUser() {
        return usersByIdUser;
    }

    public void setUsersByIdUser(Users usersByIdUser) {
        this.usersByIdUser = usersByIdUser;
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
