/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.controller;

import java.util.List;
import java.util.Optional;
import org.AiSha.Api.repository.InterfaceRepositoryProducto;
import org.AiSha.Api.repository.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/Productos")
public class ProductoController {
    @Autowired
    private InterfaceRepositoryProducto repo;
    
    @GetMapping()
    public List<Producto> consultarProducto(){
        List<Producto> lista = null;
        lista=repo.findAll();
        return lista;
    }
    
    @GetMapping("/{id}")
    public Producto consultaProdId(@PathVariable int id){
        Optional<Producto> pdcto = null;
        pdcto=repo.findById(id);
        
        return pdcto.get();
    }
    
    @PutMapping()
    public void actualizarProd(@RequestBody Producto prod) {
        repo.save(prod);
        System.out.println("OK");
    }
    
}
