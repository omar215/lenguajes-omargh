/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.util.ArrayList;

public class Zoologico {
    public static void main(String[] args) throws Exception {
        ModeloPersistenciaAnimal m=new ModeloPersistenciaAnimal();
        Animal a=new Animal();
        a.setNombre("conejo");
        a.setCarnivoro(false);
        m.guardar(a);
       // for(Animal ani:m.buscarTodos()){
            //(System.out.println(ani.getNombre());
        //}
    }
}


/*guardar mas de un animal en el programa y añadir el buscar todos
* TIP: file.exists(); true si el booleano existe, false si no
* 
* Tarea, Crear una clase usuario que tengra nombre edad y emal
* crear clase Nomina Usuario:usuario float:sueldobase int:
* Crear una clase modelo llamada ModeloPersistenciaNomina que guarde varias nominas de forma serializadas
* 
*/