/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author athos.carmo
 */
@Entity
@Table(name = "tabela_usuario")
public class Usuario implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_usu", initialValue = 1)
    @GeneratedValue(generator = "seq_usu", strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String email;
    private String senha;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
