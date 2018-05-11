package com.example.qcm_gen.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Modules {
    private int idModule;
    private String module;
    private Collection<Questions> questionsByIdModule;

    @Id
    @Column(name = "id_module", nullable = false)
    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    @Basic
    @Column(name = "module", nullable = false, length = -1)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modules modules = (Modules) o;
        return idModule == modules.idModule &&
                Objects.equals(module, modules.module);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idModule, module);
    }

    @JsonIgnore
    @OneToMany(mappedBy = "modulesByIdModule")
    public Collection<Questions> getQuestionsByIdModule() {
        return questionsByIdModule;
    }

    public void setQuestionsByIdModule(Collection<Questions> questionsByIdModule) {
        this.questionsByIdModule = questionsByIdModule;
    }
}
