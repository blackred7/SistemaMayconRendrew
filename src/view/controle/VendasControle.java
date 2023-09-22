/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.UsuarioMr;
import bean.VendasMr;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class VendasControle extends AbstractTableModel {

private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public VendasMr getbean(int linha){
return (VendasMr) lista.get(linha);
}

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
        VendasMr vendas = (VendasMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendas.getIdVendasMr();
        }
        if (columnIndex == 1) {
             return vendas.getDataMr();
        }
        if (columnIndex == 2) {
             return vendas.getQuantidadeTotalMr();
        }
        if (columnIndex == 3) {
             return vendas.getValorTotalMr();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Data";
        }
        if (columnIndex == 2) {
             return "Quantidade";
        }
        if (columnIndex == 3) {
             return "Valor";
        }
       
    return null;
    }
}
