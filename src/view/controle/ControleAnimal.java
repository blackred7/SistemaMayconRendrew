/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.FunionarioMr;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class ControleAnimal extends AbstractTableModel {



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
             return null;
        }
        if (columnIndex == 1) {
             return null;
        }
        if (columnIndex == 2) {
             return null;
        }
        if (columnIndex == 3) {
             return null;
        
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
             return "preço";
        }
        if (columnIndex == 3) {
             return "quantidade";
        }
       
    return null;
    }
}