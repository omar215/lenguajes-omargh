/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Omar
 */
public class Externo extends Usuario{ 
     
       @Override
     public void prestar()throws ExcepcionLibros{ 
         if(getLibros().length>1)throw new ExcepcionLibros(); 
     } 
 } 
