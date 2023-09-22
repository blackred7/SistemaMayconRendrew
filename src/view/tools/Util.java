/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tools;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import view.JDlgUsuarios;
            

/**
 *
 * @author u13766540670
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... vetCampo) {
        for (int i = 0; i < vetCampo.length; i++) {
           vetCampo[i].setEnabled(valor);
            
        }
    }
    
    public static void limp(JComponent ... vetCamp) {
        for (JComponent componente : vetCamp) {
            
            if (componente instanceof JTextField) {
                JTextField obj = (JTextField) componente;
                obj.setText("");
            } else  if (componente instanceof JComboBox) {
                JComboBox obj = (JComboBox) componente;
                obj.setSelectedIndex(-1);
            } else  if (componente instanceof JCheckBox) {
                JCheckBox obj = (JCheckBox) componente;
                obj.setSelected(false);
            } 
        }
           
            
        }
    
    public static void msg( String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static int perguntar(String mensagem, String pergunta) {
      return  JOptionPane.showConfirmDialog(null,  mensagem, pergunta, JOptionPane.YES_NO_OPTION);
        
    }
    public static int strInt(String cad) {
          
        return  Integer.valueOf(cad);
    }
     public static String intStr(int num) {
         
        
        return String.valueOf(num) ;
    }
     public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }
      public static String doubleStr(String num) {
        return String.valueOf(num);
    }
      public static java.util.Date strData(String cad) {
          try {
            SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yyyy");
            return formato.parse(cad);
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public static String dataStr(String data) {
          SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.format(data);
    }
}
