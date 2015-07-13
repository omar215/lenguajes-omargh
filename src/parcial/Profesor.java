/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;


public class Profesor extends Usuario{ 
      @Override
     public void prestar()throws ExcepcionLibros{ 
         if(getLibros().length>2)throw new ExcepcionLibros(); 
     } 
 } 
