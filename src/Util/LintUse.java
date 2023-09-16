/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
import java.util.List;
import bean.UsuarioMr;
import bean.UsuarioMr;
import java.util.Collections;


/**
 *
 * @author u13766540670
 */
public class LintUse {

    public static void main(String[] args) {
        UsuarioMr roro = new UsuarioMr();
        roro.setIdUsuarioMr(1);
        roro.setNomeMr("roro");
        roro.setApelidoMr("bks");
        roro.setCpfMr("345");
        roro.setNivelMr(2);
        roro.setAtivoMr("s");
        roro.setSenhaMr("1qs453");

        UsuarioMr gostoso08 = new UsuarioMr();
        gostoso08.setIdUsuarioMr(2);
        gostoso08.setNomeMr("geo");
        gostoso08.setApelidoMr("bks");
        gostoso08.setCpfMr("345");
        gostoso08.setNivelMr(2);
        gostoso08.setAtivoMr("s");
        gostoso08.setSenhaMr("1qs453");

        List lista = new ArrayList();
        lista.add(roro);
        lista.add(gostoso08);
        Collections.sort(lista);

        for (Object usuarios : lista) {
            System.out.println(((UsuarioMr) usuarios).getNomeMr());
        }

    }

}
