/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencias;

import java.util.Calendar;

public class RelojitoMejorado {
    public static void main(String[] args) {
        /*
        Aqui veremos la forma de crear un Thread usando la vieja tecnica
        de clases internas anonimas
        */
        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
            while (true){
    try{
        Thread.sleep(1000);
        //vamos a crear un relojito cghafa
        Calendar cal=Calendar.getInstance();
        int hora=cal.get(Calendar.HOUR);
        int minutos=cal.get(Calendar.MINUTE);
        int segundos=cal.get(Calendar.SECOND);
        System.out.println(hora+":"+minutos+":"+segundos);
    }catch(Exception e){
        
    }
    }
            }
            
            
        });
        t1.start();
        
    }
}
