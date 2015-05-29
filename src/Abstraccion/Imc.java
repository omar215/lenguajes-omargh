/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
    private float peso;

    public Imc() {
    }
    private float altura;
    private boolean flaco;

    public Imc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    this.flaco=flaco;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
public boolean  isflaco(){
return flaco;
