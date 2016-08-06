package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import pe.egcc.app.domain.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba07 {
  
  public static void main(String[] args) {
    
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Coca Cola", 3.0, 1000));
    lista.add(new Producto("Cristal", 10.0, 900));
    lista.add(new Producto("Inka Cola", 3.5, 1500));
    lista.add(new Producto("Azucar", 120.0, 500));
    lista.add(new Producto("Arroz", 150.0, 600));
    lista.add(new Producto("Naranja", 4.0, 1200));
    
    lista.sort( (o1,o2) -> o1.getNombre().compareToIgnoreCase(o2.getNombre()));
    
    lista.forEach(o -> System.out.println(o) );
    
  }
  
}
