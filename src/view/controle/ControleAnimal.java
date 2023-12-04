/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;

import bean.AnimaisMr;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class ControleAnimal extends AbstractTableModel {

private List lista;

public void setList(List lista){
this.lista=lista;

this.fireTableDataChanged();

}


public AnimaisMr getbean(int linha){
return (AnimaisMr) lista.get(linha);
}

public void addBean(AnimaisMr ani){
lista.add(ani);
this.fireTableDataChanged();

} 
public void removeBean(int index){
lista.remove(index);
this.fireTableDataChanged();

} 
public void updateBean(int index,AnimaisMr ani ){
lista.set(index, ani);
this.fireTableDataChanged();

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
        AnimaisMr ani = (AnimaisMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return ani.getIdAnimaisMr();
        }
        if (columnIndex == 1) {
             return ani.getNomeMr();
        }
        if (columnIndex == 2) {
             return ani.getPrecoMr();
        }
        if (columnIndex == 3) {
             return ani.getQuantidadeMr();
        
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
