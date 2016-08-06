package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista tipificada.
 * La lista es de un tipo especifico.
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();
    lista.add( "Chiclayo" );
    lista.add( "Cuzco" );
    lista.add( "Arequipa" );
    lista.add( "Huancayo" );
    lista.add( "Trujillo" );
    lista.add( "Iquitos" );
    lista.add( "Lima" );
    
    // Utilizando stream para recorren una lista
    lista.stream().sorted()
                  .forEach( elemento -> System.out.println(elemento) );
    
    
  }
}
