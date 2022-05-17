/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.controller;

import java.util.List;
import org.AiSha.Api.repository.InterfaceRepositoryUsr;
import org.AiSha.Api.repository.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Odraude Mendez Aguirre
 */
@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {
    @Autowired
    private InterfaceRepositoryUsr repo;
    
    @PostMapping()
    public boolean guardarUsr(@RequestBody Usuario user){
        repo.save(user);
        return true;
    }
    
    @GetMapping()
    public List<Usuario> consultarUsr(){
        List<Usuario> lista = null;
        lista=repo.findAll();
        return lista;
    }
}
