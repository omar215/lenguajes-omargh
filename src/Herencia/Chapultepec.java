/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Vamos a crear animalitos 
        Pollo p1=new Pollo();
        p1.setNombre("Pollito pio");
        
        Leon L1=new Leon();
        L1.setNombre("Timba");
        
        Leon L2=new Leon();
        L2.setNombre("Mufaza");
        
        Delfin D1=new Delfin();
        D1.setNombre("Flipper");
        
        Tortuga T1=new Tortuga();
        T1.setNombre("Donatelo");
        
        ComportamientoRuido animales[]=new ComportamientoRuido[4];
        animales[0]=p1;
        animales[1]=L1;
        animales[2]=L2;
        animales[3]=D1;
        
        for(ComportamientoRuido algo:animales){
            System.out.println(algo.HacerRuido());
            
        }
    }
}
   
