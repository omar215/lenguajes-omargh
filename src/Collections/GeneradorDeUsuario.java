/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.List;


public class GeneradorDeUsuario {
    
    private List<Usuarios> usuarios;
    
    public GeneradorDeUsuario(){
        Usuarios u1=new Usuarios("jaun",42,"jc@gmail.com");
        Usuarios u2=new Usuarios("Ana",22,"ana@hotmail.com");
        Usuarios u3=new Usuarios("Pedro",33,"perdo@mail.com");
        Usuarios u4=new Usuarios("pancha",60,"pancha@mail.com");
        
        usuarios=new ArrayList<Usuarios>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String agregarUsuario(String nombre, int edad, String email){
        Usuarios u=new Usuarios(nombre, edad, email);
        usuarios.add(u);
        return "usuario agregado con exito";
        
    }
}
