/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.Funcionario;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class FuncionarioControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public Funcionario getbean(int linha){
return (Funcionario) lista.get(linha);
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
        Funcionario funcionario = (Funcionario) lista.get(rowIndex);
      if (columnIndex == 0) {
             return funcionario.getIdFuncinario();
        }
        if (columnIndex == 1) {
             return funcionario.getNome();
        }
        if (columnIndex == 2) {
             return funcionario.getEmail();
        }
        if (columnIndex == 3) {
             return funcionario.getCpf();
        
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
             return "CPF";
        }
       
    return null;
    }
}
