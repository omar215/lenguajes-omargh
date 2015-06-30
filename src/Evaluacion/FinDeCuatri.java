/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;


public class FinDeCuatri {

    public static void main(String[] args) throws PorcentajeException {
        
        //Creamos un objeto tipo Examen parcial
        ExamenParcial eParcial=new ExamenParcial();
        eParcial.setCalificacion(10);
        eParcial.setPorcentaje(0.6f);
        ExamenFinal eFinal=new ExamenFinal();
        eFinal.setCalificacion(10);
        eFinal.setPorcentaje(0.4f);
       
            
        //creamos el modelo
        ModeloEvaluacion modelo=new ModeloEvaluacion();
        System.out.println(modelo.evaluar(eParcial, eFinal));
    }
    
    }
