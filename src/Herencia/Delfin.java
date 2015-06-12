/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

public class Delfin extends Animal implements ComportamientoRuido{
        public String HacerRuido() {
        return "briiipp!!!"+getNombre();
  
    }
}
