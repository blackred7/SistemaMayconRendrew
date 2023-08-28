/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import bean.Usuarios;
import java.util.Collections;

import view.JDlgUsuarios;

/**
 *
 * @author u13766540670
 */
public class LintUse {

    public static void main(String[] args) {
        Usuarios roro = new Usuarios();
        roro.setIdusuario(1);
        roro.setNome("roro");
        roro.setApelido("bks");
        roro.setCpf("345");
        roro.setNivel(2);
        roro.setAtivo("s");
        roro.setSenha("1qs453");

        Usuarios gostoso08 = new Usuarios();
        gostoso08.setIdusuario(2);
        gostoso08.setNome("geo");
        gostoso08.setApelido("bks");
        gostoso08.setCpf("345");
        gostoso08.setNivel(2);
        gostoso08.setAtivo("s");
        gostoso08.setSenha("1qs453");

        List lista = new ArrayList();
        lista.add(roro);
        lista.add(gostoso08);
        Collections.sort(lista);

        for (Object usuarios : lista) {
            System.out.println(((Usuarios) usuarios).getNome());
        }

    }

}
