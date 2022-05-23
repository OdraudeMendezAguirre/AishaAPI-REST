/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.repository;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Odraude Mendez Aguirre
 */
@Entity
@Table(name="ticket_tb")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_ticket")
    private int id;
    
    @Column(name="ptot_ticket")
    private double total;
    
    @Column(name="n_prod")
    private int nprod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getNprod() {
        return nprod;
    }

    public void setNprod(int nprod) {
        this.nprod = nprod;
    }
    
    
}
