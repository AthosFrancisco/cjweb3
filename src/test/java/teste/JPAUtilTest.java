/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.htcursos.cjweb3.model.entity.Usuario;
import com.htcursos.cjweb3.model.util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author athos.carmo
 */
public class JPAUtilTest {
    
    public static void main(String[] args) {
        
        EntityManager em = JPAUtil.abreConexao();
        
        Usuario usuario = new Usuario();
        
        usuario.setNome("athos");
        usuario.setEmail("athos@gmail.com");
        usuario.setSenha("123");
        
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
}
