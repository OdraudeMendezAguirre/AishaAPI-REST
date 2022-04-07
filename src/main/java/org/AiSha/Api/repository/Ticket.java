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
    @Column(name="id_ticket")
    private int id;
    
    @Column(name="ptot_ticket")
    private double total;
    
    @Column(name="date_ticket")
    private Date fecha;
    
    @Column(name="hr_ticket")
    private Time hora;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getNprod() {
        return nprod;
    }

    public void setNprod(int nprod) {
        this.nprod = nprod;
    }
    
    
}
