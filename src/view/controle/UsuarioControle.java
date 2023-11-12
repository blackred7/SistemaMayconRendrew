/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.UsuarioMr;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u13766540670
 */
public class UsuarioControle extends AbstractTableModel {

private List lista;

public void setList(List lista){
this.lista=lista;
this.fireTableDataChanged();
}
public  void setlist(List lista){
this.lista = lista;
}

public UsuarioMr getbean(int linha){
return (UsuarioMr) lista.get(linha);
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
         UsuarioMr usu = (UsuarioMr) lista.get(rowIndex);
      if (columnIndex == 0) {
             return usu.getIdUsuarioMr();
        }
        if (columnIndex == 1) {
             return usu.getNomeMr();
        }
        if (columnIndex == 2) {
              return usu.getApelidoMr();
        }
        if (columnIndex == 3) {
            
            if (usu.getAtivoMr().equals("S")) {
              return  "Ativo";
            }else if(usu.getAtivoMr().equals("N")){
             return  "Inativo";
            }
              return "Não encontrado";
        
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
             return "Ativo";
        }
       
    return null;
    }
}
