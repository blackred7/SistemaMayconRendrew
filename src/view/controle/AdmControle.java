/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.Adm;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class AdmControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public Adm getbean(int linha){
return (Adm) lista.get(linha);
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
        Adm adm = (Adm) lista.get(rowIndex);
      if (columnIndex == 0) {
             return adm.getIdadm();
        }
        if (columnIndex == 1) {
             return adm.getNome();
        }
        if (columnIndex == 2) {
             return adm.getEmail();
        }
        if (columnIndex == 3) {
             return adm.getNumero_tel();
        
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
             return "telefone";
        }
       
    return null;
    }
}
