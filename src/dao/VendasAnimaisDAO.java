/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import teste.testeJDBC;
import bean.VendasAnimaisMr;
import bean.VendasMr;
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
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author u03402615100
 */
public class VendasAnimaisDAO extends DAO_Abstract{
public  VendasAnimaisDAO(){



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
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
       criteria.add(Restrictions.eq("idVendasAnimaisMr", id));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
     
    }
    public Object sumV(VendasMr fk){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
        criteria.add(Restrictions.eq("vendasMr", fk )); 
        criteria.setProjection(Projections.sum("valorUnitarioMr"));
          List lista = criteria.list();
         
       
        session.getTransaction().commit();
    return  lista.get(0);
    }  
    public Object sumQ(VendasMr fk){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
        criteria.add(Restrictions.eq("vendasMr", fk )); 
        criteria.setProjection(Projections.sum("quantidadeUnitariaMr"));
          List lista = criteria.list();
         
       
        session.getTransaction().commit();
    return  lista.get(0);
    }  
    public String del(VendasMr fk){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
          criteria.add(Restrictions.eq("vendasMr", fk));
          List lista = criteria.list();
         for (int i = 0; i < lista.size(); i++) {
           Object object = lista.get(i);
             session.delete(object);
       
        }
       
        session.getTransaction().commit();
    return "foi";
    
    }  
    public Object listfk(VendasMr fk){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasAnimaisMr.class);
        criteria.add(Restrictions.eq("vendasMr", fk));
        criteria.setProjection(Projections.count("vendasMr"));
    
          List lista = criteria.list();
         
       
        session.getTransaction().commit();
       Object ver = 0;
    
        if (fk == null || lista.get(0) == ver ) {
            return  null;
        }
        
    return  lista.get(0);
    }  
    
    public static void main(String[] args) {
      VendasAnimaisDAO vadao = new VendasAnimaisDAO();
      VendasDAO vadao2 = new VendasDAO();
      VendasMr vendasMr =new VendasMr();
     Object conr  = vadao2.busca(2222);
    
    
        System.out.println( vadao.del((VendasMr) conr));
    }
  
}