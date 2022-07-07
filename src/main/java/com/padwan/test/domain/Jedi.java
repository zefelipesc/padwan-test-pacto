package com.padwan.test.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jedi implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer midichlorians;

    @Enumerated(EnumType.STRING)
    private Status status;
    private Integer quantidade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    public Jedi() {
    }

    public Jedi(Integer id, String nome, Integer midichlorians, Mentor mentor, Status status, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.midichlorians = midichlorians;
        this.mentor = mentor;
        this.status = status;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getMidichlorians() {
        return midichlorians;
    }

    public void setMidichlorians(Integer midichlorians) {
        this.midichlorians = midichlorians;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
