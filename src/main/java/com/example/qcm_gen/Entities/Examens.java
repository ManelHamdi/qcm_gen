package com.example.qcm_gen.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Examens {
    private int idExamen;
    private String titre;
    private String consigne;
    private int duree;
    private Date dateDeb;
    private Time heureDeb;
    private String cle;
    private Collection<QuestionsExamen> questionsExamenByIdExamen;
    private Collection<UsersExamen> usersExamenByIdExamen;

    @Id
    @Column(name = "id_examen", nullable = false)
    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    @Basic
    @Column(name = "titre", nullable = false, length = 100)
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Basic
    @Column(name = "consigne", nullable = false, length = -1)
    public String getConsigne() {
        return consigne;
    }

    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    @Basic
    @Column(name = "duree", nullable = false)
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Basic
    @Column(name = "date_deb", nullable = false)
    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    @Basic
    @Column(name = "heure_deb", nullable = false)
    public Time getHeureDeb() {
        return heureDeb;
    }

    public void setHeureDeb(Time heureDeb) {
        this.heureDeb = heureDeb;
    }

    @Basic
    @Column(name = "cle", nullable = false, length = 45)
    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examens examens = (Examens) o;
        return idExamen == examens.idExamen &&
                duree == examens.duree &&
                Objects.equals(titre, examens.titre) &&
                Objects.equals(consigne, examens.consigne) &&
                Objects.equals(dateDeb, examens.dateDeb) &&
                Objects.equals(heureDeb, examens.heureDeb) &&
                Objects.equals(cle, examens.cle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idExamen, titre, consigne, duree, dateDeb, heureDeb, cle);
    }

    @JsonIgnore
    @OneToMany(mappedBy = "examensByIdExamen")
    public Collection<QuestionsExamen> getQuestionsExamenByIdExamen() {
        return questionsExamenByIdExamen;
    }

    public void setQuestionsExamenByIdExamen(Collection<QuestionsExamen> questionsExamenByIdExamen) {
        this.questionsExamenByIdExamen = questionsExamenByIdExamen;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "examensByIdExamen")
    public Collection<UsersExamen> getUsersExamenByIdExamen() {
        return usersExamenByIdExamen;
    }

    public void setUsersExamenByIdExamen(Collection<UsersExamen> usersExamenByIdExamen) {
        this.usersExamenByIdExamen = usersExamenByIdExamen;
    }
}
