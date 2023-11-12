/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import teste.testeJDBC;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import bean.UsuarioMr;


/**
 *
 * @author u03402615100
 */
public class UsuariosDAO extends DAO_Abstract{
public  UsuariosDAO(){



}

    @Override
    public void insert(Object object) {
       session.beginTransaction();
session.save(object);
session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
      session.beginTransaction();
        session.flush();
session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
    session.beginTransaction();
        session.flush();
session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
       criteria.add(Restrictions.eq("idUsuario_MR", id));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
     
    }
    
    public List listNome(String nome){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
        criteria.add(Restrictions.like("nomeMr", "%" + nome + "%"));      
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
     public List listAtivo(String ativo){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
        criteria.add(Restrictions.like("ativoMr",  ativo ));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }   
      public List listNomeAtivo(String nome, String ativo){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
        criteria.add(Restrictions.like("nomeMr", "%" + nome + "%"));
        criteria.add(Restrictions.like("ativoMr",  ativo ));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }  
     
     public List busca(String tab, String var){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioMr.class);
        criteria.add(Restrictions.eq(tab, var ));
          List lista = criteria.list();
       
        session.getTransaction().commit();
    return  lista;
    }    
    public static void main(String[] args) {
        
    }
}