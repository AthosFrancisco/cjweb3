/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author athos.carmo
 */
@Entity
public class Estado implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_est", initialValue = 1)
    @GeneratedValue(generator = "seq_est", strategy = GenerationType.AUTO)
    private Integer id;
    
    private String uf;
    
    @OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
    private List<Cidade> cidades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
    
}
