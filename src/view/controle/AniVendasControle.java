/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VendasAnimaisMr;

import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class AniVendasControle extends AbstractTableModel {

private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}


public VendasAnimaisMr getbean(int linha){
return (VendasAnimaisMr) lista.get(linha);
}
public void addBean(VendasAnimaisMr veAn){
lista.add(veAn);
this.fireTableDataChanged();

} 
public void removeBean(int index){
lista.remove(index);
this.fireTableDataChanged();

} 
public void updateBean(int index,VendasAnimaisMr veAn ){
lista.set(index, veAn);
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
        VendasAnimaisMr vendas = (VendasAnimaisMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendas.getIdVendasAnimaisMr();
        }
        if (columnIndex == 1) {
             return vendas.getAnimaisMr();
        }
        if (columnIndex == 2) {
             return vendas.getVendasMr();
        }
        if (columnIndex == 3) {
             return vendas.getQuantidadeUnitariaMr();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Animais";
        }
        if (columnIndex == 2) {
             return "Vendas";
        }
        if (columnIndex == 3) {
             return "Valor";
        }
       
    return null;
    }
}
