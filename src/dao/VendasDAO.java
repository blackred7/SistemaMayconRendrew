/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import teste.testeJDBC;
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
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author u03402615100
 */
public class VendasDAO extends DAO_Abstract{
public  VendasDAO(){



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
       Criteria criteria = session.createCriteria(VendasMr.class);
       criteria.add(Restrictions.eq("idVendasMr", id));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasMr.class);
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
     
    }
     public List listValor(double valor){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasMr.class);
        criteria.add(Restrictions.le("valorTotalMr",  valor ));      
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
       public List listValorQuant(double valor, int quant){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasMr.class);
        criteria.add(Restrictions.le("valorTotalMr",  valor ));      
        criteria.add(Restrictions.le("quantidadeTotalMr", quant));      
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
        public List listQuant(int quant){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasMr.class);   
        criteria.add(Restrictions.le("quantidadeTotalMr", quant));      
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }   
        public Object busca(int quant){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VendasMr.class);   
        criteria.add(Restrictions.like("idVendasMr", quant));      
        List lista = criteria.list();
        session.getTransaction().commit();
        
            if (!lista.isEmpty() ) {
                return  lista.get(0);
            }
    return null;
        
    
   
    
    }   
       
    public static void main(String[] args) {
        VendasDAO vdao = new VendasDAO();
        Object con = vdao.busca(1);
        System.out.println(con);
    }
}