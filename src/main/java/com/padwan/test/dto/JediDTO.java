package com.padwan.test.dto;

import java.io.Serializable;

import com.padwan.test.domain.Jedi;
import com.padwan.test.domain.Status;

public class JediDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Integer midichlorians;
    private Status status;

    public JediDTO() {
    }

    public JediDTO(Jedi obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.midichlorians = obj.getMidichlorians();
        this.status = obj.getStatus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
