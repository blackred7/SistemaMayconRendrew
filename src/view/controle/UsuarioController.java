/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class UsuarioController extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
         return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      
      if (columnIndex == 0) {
             return "a";
        }
        if (columnIndex == 1) {
             return "b";
        }
        if (columnIndex == 2) {
             return "c";
        }
        if (columnIndex == 3) {
             return "d";
        
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
