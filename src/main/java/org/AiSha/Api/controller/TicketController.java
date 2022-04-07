/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.controller;

import java.util.List;
import org.AiSha.Api.repository.InterfaceRepositoryTicket;
import org.AiSha.Api.repository.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sheir
 */
@RestController
@RequestMapping("/Ticket")
public class TicketController {
    @Autowired
    private InterfaceRepositoryTicket repo;
    
    @PostMapping()
    public boolean guardarVenta(@RequestBody Ticket ticket){
        repo.save(ticket);
        return true;
    }
    
    @GetMapping()
    public List<Ticket> consultarTicket(){
        List<Ticket> lista = null;
        lista=repo.findAll();
        return lista;
    }
}
