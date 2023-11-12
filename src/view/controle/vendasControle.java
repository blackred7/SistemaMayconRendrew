/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import javax.swing.table.AbstractTableModel;
import bean.VendasMr;
import java.util.List;

/**
 *
 * @author u13766540670
 */
public class vendasControle extends AbstractTableModel  {
    private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}
public  void setlist(List lista){
this.lista = lista;
}

public VendasMr getbean(int linha){
return (VendasMr) lista.get(linha);
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
         VendasMr venda = (VendasMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return venda.getIdVendasMr();
        }
        if (columnIndex == 1) {
             return venda.getDataMr();
        }
        if (columnIndex == 2) {
              return venda.getValorTotalMr();
        }
        if (columnIndex == 3) {
            
        
              return venda.getQuantidadeTotalMr();
        
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
             return "Valor total";
        }
        if (columnIndex == 3) {
             return "Quantidade total";
        }
       
    return null;
    }
}

