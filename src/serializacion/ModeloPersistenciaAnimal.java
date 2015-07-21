/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
//persistencia se refiere a guardar
public class ModeloPersistenciaAnimal {
    
    public void guardar(Animal animal)throws Exception {
        //paso 1 crear el carchivo donde se guardara el animal
        File file=new File("D:\\animalitos.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
    }
    
}
