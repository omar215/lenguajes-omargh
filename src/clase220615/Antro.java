
package clase220615;


public class Antro{

  
    public static void main(String[] args) {
        Direccion d1=new Direccion(55130,"Ecatepec");
        Usuarios u1=new Usuarios("Juan", 42, "jcampos@gmail.com", d1);
        System.out.println(d1.getMunicipio());
        System.out.println(d1.getCP());
        System.out.println(u1.getNombre());
        System.out.println(u1.getEdad());
        System.out.println(u1.getEmail());
        Bebida bebida=new Bebida();
        bebida.setTipo("BebidasAlcoholicas");
        String[]reco= bebida.ObtenerRecomendaciones();
        for(String be:reco){
        System.out.println("Bebidas: "+be);
    }
         
    }
    
}
