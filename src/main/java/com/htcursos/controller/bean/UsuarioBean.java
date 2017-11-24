package com.htcursos.controller.bean;

//import javax.faces.bean.ManagedBean;
import com.htcursos.cjweb3.model.entity.Usuario;
import com.htcursos.cjweb3.model.service.ServiceException;
import com.htcursos.cjweb3.model.service.UsuarioService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;

//@ManagedBean
@Controller
@ViewScoped
public class UsuarioBean {
    
    private Usuario usuario = new Usuario();

    @Inject
    private UsuarioService usuarioService;
    
    public void salvar(){
        
        try {
            getUsuarioService().salvar(usuario);
        } catch (ServiceException ex) {
            //Codigo da mensagem na tela
            ex.printStackTrace();
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    
}
