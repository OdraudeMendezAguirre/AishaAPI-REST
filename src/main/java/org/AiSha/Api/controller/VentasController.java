/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.controller;

import java.util.List;
import org.AiSha.Api.repository.InterfaceRepositoryProducto;
import org.AiSha.Api.repository.InterfaceRepositoryVenta;
import org.AiSha.Api.repository.Venta;
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
@RequestMapping("/Ventas")
public class VentasController {
    @Autowired
    private InterfaceRepositoryVenta repo;
    
    @PostMapping()
    public boolean guardarVenta(@RequestBody Venta venta){
        repo.save(venta);
        return true;
    }
    
    @GetMapping()
    public List<Venta> consultarVentas(){
        List<Venta> lista = null;
        lista=repo.findAll();
        return lista;
    }
}
