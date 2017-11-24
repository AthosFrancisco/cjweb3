/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author athos.carmo
 */
public class JPAUtil {
    
    protected static EntityManagerFactory emf;
    protected static EntityManager em;
    
    static{
        //emf = Persistence.createEntityManagerFactory("persistence-unit"); 
        //em = emf.createEntityManager();
    }
    
    public static EntityManager abreConexao(){
        return em;
    }
}
