/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htcursos.cjweb3.model.dao;

import com.htcursos.cjweb3.model.entity.Usuario;
//import com.htcursos.cjweb3.model.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author athos.carmo
 */
@Repository
public class UsuarioDAO {

    //injeção de dependência do Entity Manager
    @PersistenceContext
    EntityManager em;

    public UsuarioDAO() {
        //em = JPAUtil.abreConexao();
    }

    @Transactional
    public void salvar(Usuario usuario) throws DAOException {
        try {
            //em.getTransaction().begin();
            em.merge(usuario);
            //em.getTransaction().commit();
        } catch (Exception e) {
            throw new DAOException("Não foi possível salvar", e);
            //e.printStackTrace();
            //em.getTransaction().rollback();
        }
    }

    public void excluir(Usuario usuario) {

        em.getTransaction().begin();
        Usuario u = em.find(Usuario.class, usuario.getId());
        em.remove(u);
        em.getTransaction().commit();

    }

    @SuppressWarnings("unchecked")
    public List<Usuario> buscarTodos() {
        Query q = em.createQuery("select u from Usuario u");
        return q.getResultList();
    }

    public Usuario buscarPorId(Integer id) {
        return em.find(Usuario.class, id);
    }
}
