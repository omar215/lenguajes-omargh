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
      @Override
    public void prestar()throws ExcepcionLibros{
        if(getLibros().length>3)throw new ExcepcionLibros();
        
    }
}
