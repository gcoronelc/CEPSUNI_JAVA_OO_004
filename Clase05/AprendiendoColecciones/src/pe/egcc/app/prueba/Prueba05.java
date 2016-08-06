package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Lista tipificada.
 * La lista es de un tipo especifico.
 * Ordenamiento clasico.
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
       
    lista.add( "Chiclayo" );
    lista.add( "Cuzco" );
    lista.add( "Arequipa" );
    lista.add( "Huancayo" );
    lista.add( "Trujillo" );
    lista.add( "Iquitos" );
    lista.add( "Lima" );
    
    // Agregando un comparador para ordenar la lista
    // Metodo clasico
    lista.sort(new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
      }
      
    });
    
    // Utilizando stream para recorren una lista
    lista.forEach( elemento -> System.out.println(elemento) );
    
    
  }
}
