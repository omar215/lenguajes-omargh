/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;


public class Imc {

    public Imc() {
    }
  
    private float peso;
    private float estatura;

    public Imc(float peso, float estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }


    public float calcular(){
        
        return peso/(estatura*estatura);
        
        
        
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }
           
    
}