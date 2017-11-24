/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.service;

import com.htcursos.cjweb3.model.dao.DAOException;

/**
 *
 * @author athos.carmo
 */
public class ServiceException extends Exception{

    ServiceException(String mensagem) {
        super(mensagem);
    }

    ServiceException(String mensagem, DAOException ex) {
        super(mensagem, ex);
    }
    
}
