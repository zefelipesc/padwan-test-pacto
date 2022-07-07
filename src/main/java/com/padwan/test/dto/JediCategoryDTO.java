package com.padwan.test.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.padwan.test.domain.Jedi;
import com.padwan.test.domain.Status;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JediCategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Status status;
    private Integer quantidade;

    public JediCategoryDTO(Jedi obj) {
        this.id = obj.getId();
        this.status = obj.getStatus();
        this.quantidade = obj.getQuantidade();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
