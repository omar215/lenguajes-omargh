/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[] args) {
        GeneradorDeUsuario generadora=new GeneradorDeUsuario();
                           generadora.agregarUsuario("Chana", 18, "mail");
        ArrayList<Usuarios> usuarios= (ArrayList<Usuarios>)generadora.getUsuarios();
                            System.out.println(usuarios.size());
       for(Usuarios u:usuarios){
           System.out.println("Nombre: "+u.getNombre()+" edad: "+u.getEdad()+" email: "+u.getEmail());
       }                    
    }
}
