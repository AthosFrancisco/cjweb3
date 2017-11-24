/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.htcursos.cjweb3.model.dao.DAOException;
import com.htcursos.cjweb3.model.dao.UsuarioDAO;
import com.htcursos.cjweb3.model.entity.Usuario;
import java.util.List;
import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author athos.carmo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/applicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class TestUsuarioDAO {

    @Inject
    UsuarioDAO usuDAO;
    
    @Test
    public void testSalvar() throws DAOException {
        
        Usuario usuario = new Usuario();
        usuario.setNome("rodrigo");
        usuario.setEmail("rodrigo@gmail.com");
        usuario.setSenha("123");
        
        usuDAO.salvar(usuario);
        
        Assert.assertNotNull(usuario.getId());
    }
    
    //@Test
    public void testBuscarTodos(){
        List<Usuario> lista = usuDAO.buscarTodos();
        for(Usuario u : lista){
            System.out.println(u.getNome());
            System.out.println(u.getEmail());
            System.out.println(u.getSenha());
        }
        assertTrue(lista.size()>0);
    }
    
    //@Test
    public void testExcluir(){
        
        Usuario usuario = new Usuario();
        usuario.setId(1);
        
        usuDAO.excluir(usuario);
        
        //Assert.assertNull(usuario.getId());
    }
    
    //@Test
    public void testBuscarPorId(){
        
        Usuario u = usuDAO.buscarPorId(2);
        
        System.out.println(u.getNome());
    }
}
