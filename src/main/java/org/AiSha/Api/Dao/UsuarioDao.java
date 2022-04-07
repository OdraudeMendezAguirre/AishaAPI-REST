/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AiSha.Api.Dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.AiSha.Api.repository.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 *
 * @author sheir
 */
public class UsuarioDao {
    public static Usuario getUsrByAddress(String correo)  {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        CriteriaBuilder cb = session.getCriteriaBuilder();
        
        CriteriaQuery<Usuario> cr = cb.createQuery(Usuario.class);
        Root<Usuario> root = cr.from(Usuario.class);
        cr.select(root).where(cb.equal(root.get("correo"), correo));  //here you pass a class field, not a table column (in this example they are called the same)

        Query query = session.createQuery(cr);
        query.setMaxResults(1);
        List<Usuario> resultList = query.getResultList();

        Usuario result = resultList.get(0);
        
        return result;
  }
}
