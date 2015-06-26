/*
 * En la clase bebida declarar un atributo de tipo String que se llame tipo
 * Igualmente declarar un atributo de tipo arreglo de Strings
 * 
 * String [] bebidas
 * Arreglo de String
 * 
 * En esa clase generar un metodo que se llame obtener recomendaciones
 * Alli crear un arreglo con 5 bebidas alcoholicas y 5 no alcoholicas
 *
 * Si el tipo de bebida es alcoholica regresar el arreglo de bebidas alcoholicas
 * Y si el tipo es no alcoholica regresar el tipo de arreglo de no alcoholicas
 */
package clase220615;


public class Bebida {
    
    private String tipo;
    private String [] Bebidas;
    
    //void no permite regresar
    public String[] ObtenerRecomendaciones( ){
        if (tipo.equals("BebidasAlcoholicas")){
        String[] BebidasAlcoholicas={"Tequila","Cerveza","Whisky","Vodka","Ron"};
        return BebidasAlcoholicas;
    }else{
        String[] BebidasNoAlcoholicas={"Limonada","Naranjada","Cafe","Refresco","Agua"};
        return BebidasNoAlcoholicas;
        }
        
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return Bebidas;
    }

    public void setBebidas(String[] Bebidas) {
        this.Bebidas = Bebidas;
    }
}


