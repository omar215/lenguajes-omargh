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
public class Alumno extends Usuario {
    private void prestar()throws ExcepcionLibros{
        if(getLibros().lenght>3)throw new ExcepcionLibros();
        
    }
}
