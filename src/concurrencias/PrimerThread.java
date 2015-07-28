/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencias;


// heredando la clase thread
public class PrimerThread extends Thread {
    public void run(){
        while (true){
        try{
            Thread.sleep(1000);
        System.out.println("Yo soy el primer Thread");
    }catch (InterruptedException e){
        
    }
       
   }//aqui se cierra el while
   }//aqui se cierra el run
}