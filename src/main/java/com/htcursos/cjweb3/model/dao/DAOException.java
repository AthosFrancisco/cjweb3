/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.dao;

/**
 *
 * @author athos.carmo
 */
public class DAOException extends Exception {

    public DAOException(String mensagem, Exception e) {
        super(mensagem, e);
    }
    
}
