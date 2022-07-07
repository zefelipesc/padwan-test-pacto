package com.padwan.test.dto;

import java.io.Serializable;
import java.util.List;

import com.padwan.test.domain.Jedi;
import com.padwan.test.domain.Mentor;

public class MentorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private final List<Jedi> jediList;

    public MentorDTO(Mentor obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.jediList = obj.getJediList();
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

    public List<Jedi> getJediList() {
        return jediList;
    }
}
