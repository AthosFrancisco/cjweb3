/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.service;

import com.htcursos.cjweb3.model.dao.DAOException;
import com.htcursos.cjweb3.model.dao.UsuarioDAO;
import com.htcursos.cjweb3.model.entity.Usuario;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 *
 * @author athos.carmo
 */
@Service
public class UsuarioService {
    
    @Inject
    private UsuarioDAO usuarioDAO;
    
    public void salvar(Usuario usuario) throws ServiceException{
        
        //Validacao de Regra de Negocio
        if(usuario.getNome()== null){
            throw new ServiceException("Nome é obrigatório");
        }
        
        try {
            usuarioDAO.salvar(usuario);
        } catch (DAOException ex) {
            throw new ServiceException("Não foi possível salvar", ex);
        }
    }
}
