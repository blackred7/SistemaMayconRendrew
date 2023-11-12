package dao;

import bean.ClienteMr;
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


/**
 *
 * @author u03402615100
 */
public class ClienteDAO extends DAO_Abstract{
public  ClienteDAO(){



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
       Criteria criteria = session.createCriteria(ClienteMr.class);
       criteria.add(Restrictions.eq("idCliente_MR", id));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteMr.class);
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
     
    }
    public List listNome(String nome){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteMr.class);
        criteria.add(Restrictions.like("nomeMr", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
    public List listNomeCep(String nome, String cep){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteMr.class);
        criteria.add(Restrictions.like("nomeMr", "%" + nome + "%"));
        criteria.add(Restrictions.like("cepMr", "%" + cep + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
    public List listCep(String cep){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(ClienteMr.class);
        criteria.add(Restrictions.like("cepMr", "%" + cep + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
}