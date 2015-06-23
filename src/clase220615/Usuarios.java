/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase220615;
  
public class Usuarios  {
    private String Nombre;
    private int Edad;
    private String Email;    
    private Direccion direccion;

    public Usuarios() {
    }
    

    public Usuarios(String Nombre, int Edad, String Email, Direccion direccion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Email = Email;
        this.direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public void setDireccion(Direccion direccion){
        this.direccion=direccion;
    }
    
}
