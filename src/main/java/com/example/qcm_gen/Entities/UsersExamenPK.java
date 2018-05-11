package com.example.qcm_gen.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UsersExamenPK implements Serializable {
    private int idUser;
    private int idExamen;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersExamenPK that = (UsersExamenPK) o;
        return idUser == that.idUser &&
                idExamen == that.idExamen;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, idExamen);
    }
}
