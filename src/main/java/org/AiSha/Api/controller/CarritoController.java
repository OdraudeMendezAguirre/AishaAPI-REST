/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.controller;

import java.util.List;
import org.AiSha.Api.repository.CarritoItem;
import org.AiSha.Api.repository.InterfaceRepositoryCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/Carrito")
public class CarritoController {
    @Autowired
    private InterfaceRepositoryCarrito repo;
    
    @GetMapping()
    public List<CarritoItem> consultarCarritoItems(){
        return repo.findAll();
    }
    
    @PostMapping()
    public CarritoItem agregarItem(@RequestBody CarritoItem item){
        return repo.save(item);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarItem(@PathVariable int id){
        repo.deleteById(id);
    }
    @DeleteMapping()
    public void vaciar(){
        repo.deleteAll();
    }
}
