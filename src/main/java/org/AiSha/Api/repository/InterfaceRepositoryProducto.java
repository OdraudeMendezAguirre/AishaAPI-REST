/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Odraude Mendez Aguirre
 */
@Repository
public interface InterfaceRepositoryProducto extends JpaRepository<Producto, Integer>{
    
}
