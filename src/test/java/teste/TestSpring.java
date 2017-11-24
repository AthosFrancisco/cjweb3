/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.htcursos.cjweb3.model.dao.DAOException;
import com.htcursos.cjweb3.model.dao.UsuarioDAO;
import com.htcursos.cjweb3.model.entity.Usuario;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author athos.carmo
 */
public class TestSpring {
    
    @Test
    public void testSrping() throws DAOException{
        
        ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsuarioDAO usuarioDAO = contexto.getBean(UsuarioDAO.class);
        
        Usuario usuario = new Usuario();
        usuario.setNome("Maria");
        usuario.setSenha("123");
        usuario.setEmail("maria@homtial.com");
        
        usuarioDAO.salvar(usuario);
    }
}
