/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimeraExcepcion;


public class MenorDeEdadException extends Exception {
    public MenorDeEdadException(){
        super("eres un chamaco pervertido, no te puedo" + "registrar");
    }
}
