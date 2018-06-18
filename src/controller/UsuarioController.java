/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author jesp
 */
public class UsuarioController {
    
    UsuarioDAO uDao = new UsuarioDAO();
    
    public Usuario authenticate(String login, String senha){
        Usuario u = null;
        if(uDao.findUsuario(login) != null){
            u = uDao.findUsuario(login);
          if (u.getLogin().equals(login) && u.getSenha().equals(senha))
                  return u;
        }
        return null;
    }
}
