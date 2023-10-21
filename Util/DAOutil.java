/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import dao.DAO_Abstract;
import java.util.List;

/**
 *
 * @author User
 */
public class DAOutil extends DAO_Abstract{
public DAOutil(){}
    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
      session.beginTransaction();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
