package com.example.qcm_gen.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Users {
    private int idUser;
    private String login;
    private String email;
    private String passwd;
    private String nom;
    private String prenom;
    private Collection<UsersExamen> usersExamenByIdUser;

    @Id
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 40)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "passwd", nullable = false, length = 100)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "nom", nullable = false, length = 45)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "prenom", nullable = false, length = 45)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return idUser == users.idUser &&
                Objects.equals(login, users.login) &&
                Objects.equals(email, users.email) &&
                Objects.equals(passwd, users.passwd) &&
                Objects.equals(nom, users.nom) &&
                Objects.equals(prenom, users.prenom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, login, email, passwd, nom, prenom);
    }

    @JsonIgnore
    @OneToMany(mappedBy = "usersByIdUser")
    public Collection<UsersExamen> getUsersExamenByIdUser() {
        return usersExamenByIdUser;
    }

    public void setUsersExamenByIdUser(Collection<UsersExamen> usersExamenByIdUser) {
        this.usersExamenByIdUser = usersExamenByIdUser;
    }
}
