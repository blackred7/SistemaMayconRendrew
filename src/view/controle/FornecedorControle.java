/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.Fornecedor;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class FornecedorControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public Fornecedor getbean(int linha){
return (Fornecedor) lista.get(linha);
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
        Fornecedor fornecedor = (Fornecedor) lista.get(rowIndex);
      if (columnIndex == 0) {
             return fornecedor.getId_fornecedor();
        }
        if (columnIndex == 1) {
             return fornecedor.getNome();
        }
        if (columnIndex == 2) {
            return fornecedor.getCpf_cnpj();
             
        }
        if (columnIndex == 3) {
            return fornecedor.getEmail();
        
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
             return "Cpf_Cnpj";
        }
        if (columnIndex == 3) {
             return "Email";
        }
       
    return null;
    }
}
