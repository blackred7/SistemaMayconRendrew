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
public class ControleFuncionario extends AbstractTableModel {

private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public FunionarioMr getbean(int linha){
return (FunionarioMr) lista.get(linha);
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
        FunionarioMr funcionario = (FunionarioMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return funcionario.getIdFunionarioMr();
        }
        if (columnIndex == 1) {
             return funcionario.getNomeMr();
        }
        if (columnIndex == 2) {
             return funcionario.getEmailMr();
        }
        if (columnIndex == 3) {
             return funcionario.getNumeroTelMr();
        
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
             return "Numero";
        }
       
    return null;
    }
}

