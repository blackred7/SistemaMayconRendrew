/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.ClienteMr;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class ClienteControle extends AbstractTableModel {


private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}
public  void setlist(List lista){
this.lista = lista;
}

public ClienteMr getbean(int linha){
return (ClienteMr) lista.get(linha);
}


    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     ClienteMr cliente = (ClienteMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cliente.getIdClienteMr();
        }
        if (columnIndex == 1) {
             return cliente.getNomeMr();
        }
        if (columnIndex == 2) {
             return cliente.getEmailMr();
        }
        if (columnIndex == 3) {
             return cliente.getCepMr();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Email";
        }
        if (columnIndex == 3) {
             return "cep";
        }
       
    return null;
    }
}
