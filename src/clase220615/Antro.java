/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase220615;


public class Antro{

  
    public static void main(String[] args) {
        Direccion d1=new Direccion(55130,"Ecatepec");
       Usuarios u1=new Usuarios("Juan", 42, "jcampos@gmail.com", d1);
        System.out.println(u1.getDireccion().getMunicipio());
         
    }
    
}
