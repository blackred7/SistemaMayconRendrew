/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import teste.testeJDBC;
import bean.Compra;
import bean.Vendas;
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

/**
 *
 * @author u03402615100
 */
public class ComprasDAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
        Compra compra = (Compra) object;
       try{
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_maycon_borges";
            use = "maycon_borges";
            password = "maycon_borges"; 
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
            PreparedStatement pstm;
            String sql = "insert into compra values(?,?,?, ?, ?)";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compra.getId_compra());
            pstm.setInt(2, compra.getFornecedor());
            pstm.setInt(3, compra.getFuncionario());
            pstm.setDate(4, (java.sql.Date) new Date(2001,1,1));
            pstm.setDouble(5, compra.getTotal());
            
            
            pstm.executeUpdate();
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Object object) {
       
       Compra compra = (Compra) object;
       try{
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_maycon_borges";
            use = "maycon_borges";
            password = "maycon_borges"; 
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
            PreparedStatement pstm;
            String sql = "update compra set fornecedor=?, funcionario=?,data=?, total=? where id_compra=?";
            pstm = cnt.prepareStatement(sql);
             
            pstm.setInt(1, compra.getFornecedor());
            pstm.setInt(2, compra.getFuncionario());
            pstm.setDate(3, (java.sql.Date) new Date(2001,1,1));
            pstm.setDouble(4, compra.getTotal());
            pstm.setInt(5, compra.getId_compra());
            
            pstm.executeUpdate();
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
     public void delete(Object object) {
      
          Compra compra = (Compra) object;
       try{
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_maycon_borges";
            use = "maycon_borges";
            password = "maycon_borges"; 
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
            PreparedStatement pstm;
            String sql = "delete from compra where id_compra=?";
            pstm = cnt.prepareStatement(sql);
           pstm.setInt(1, compra.getId_compra());
            
            pstm.executeUpdate();
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
     public Object list(int id) {
        Compra compra = new Compra();
       try{
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_maycon_borges";
            use = "maycon_borges";
            password = "maycon_borges"; 
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
            PreparedStatement pstm;
            String sql = "select * from compra where id_compra=?";
            pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            
            ResultSet rs = pstm.executeQuery();
            if(rs.next()==true){
           compra.setId_compra(rs.getInt("id_compra"));
           compra.setFornecedor(rs.getInt("fornecedor"));
           compra.setFuncionario(rs.getInt("funcionario"));
           compra.setData(rs.getDate("data"));
           compra.setTotal(rs.getDouble("total"));
            }
            
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return compra;
        
    }

    @Override
    public List listAll() {
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_maycon_borges";
            use = "maycon_borges";
            password = "maycon_borges";
            List lista = new ArrayList();
       try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
            PreparedStatement pstm;
            String sql = "select * from compra";
            pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()==true){
            Compra compra = new Compra();
           compra.setId_compra(rs.getInt("id_compra"));
           compra.setFornecedor(rs.getInt("fornecedor"));
           compra.setFuncionario(rs.getInt("funcionario"));
           compra.setData(rs.getDate("data"));
           compra.setTotal(rs.getDouble("total"));
           lista.add(compra);
            }
            
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testeJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static void main(String[] args) {
       Compra compra = new Compra();
        compra.setId_compra(2);
        compra.setFuncionario(1);
        compra.setFornecedor(1);
//        compra.setData("");
        compra.setTotal(13.50);
        
        
        ComprasDAO compraDAO = new ComprasDAO();
       compraDAO.update(compra);
        System.out.println(compra);
    }
}
    