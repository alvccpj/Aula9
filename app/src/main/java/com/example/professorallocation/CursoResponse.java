package com.example.professorallocation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//espelhar a resposta do servidor

@JsonIgnoreProperties({"allocations"})
public class CursoResponse {

    private int id;
    private String name;

    public CursoResponse() {
    }

    public CursoResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //retornar o nome do curso
    @Override
    public String toString() {
        return name;
    }
}

