/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author T-107
 */
public class Usuario {
    private String Nombre;
    private Libros libros[];

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Libros[] getLibros() {
        return libros;
    }

    public void setLibros(Libros[] libros) {
        this.libros = libros;
    }
    
}
