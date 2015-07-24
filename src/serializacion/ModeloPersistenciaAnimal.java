/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
import java.util.ArrayList;
//persistencia se refiere a guardar
public class ModeloPersistenciaAnimal {
    
    String ruta ="D:\\animalitos.xxx";
    ArrayList<Animal> animales;
    public ModeloPersistenciaAnimal(){
        animales=new ArrayList<Animal>();
    }
    
    public void guardar(Animal animal)throws Exception {
        //paso 1 crear el carchivo donde se guardara el animal
        File file=new File(ruta);
        if (file.exists()){
        animales= buscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animales);
        System.out.println("Animalito comprimido con exito");
    }
    
    public ArrayList<Animal> buscarTodos()throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
                animales=(ArrayList<Animal>) ois.readObject();
                return animales;
    }
}
