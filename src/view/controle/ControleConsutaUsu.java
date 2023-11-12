/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.UsuarioMr;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class ControleConsutaUsu extends AbstractTableModel{
    private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public UsuarioMr getbean(int linha){
return (UsuarioMr) lista.get(linha);
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
         UsuarioMr usu = (UsuarioMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return usu.getIdUsuarioMr();
        }
        if (columnIndex == 1) {
             return usu.getNomeMr();
        }
        if (columnIndex == 2) {
              return usu.getApelidoMr();
        }
        if (columnIndex == 3) {
              return usu.getCpfMr();
        
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
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "CPF";
        }
       
    return null;
    }
}
