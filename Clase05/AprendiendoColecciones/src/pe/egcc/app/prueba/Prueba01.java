package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.domain.Producto;

/**
 * Ejemplo de lista generica. Sus elementos pueden ser de cualquier titpo.
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    List lista = new ArrayList();
    
    // Agregando elementos
    lista.add("Gustavo");
    lista.add(777);
    lista.add(456.78);
    lista.add(new Producto());
    
    mostrarLista(lista);

    // Insertando elementos
    lista.add(2, "José");
    mostrarLista(lista);

    // Modificar un elemento
    lista.set(1, 888);
    mostrarLista(lista);

    // Eliminar un elemento
    lista.remove(1);
    mostrarLista(lista);
    
  }

  private static void mostrarLista(List lista) {
    System.out.println("LISTA");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(i + ".- " + lista.get(i));
    }
    System.out.println("-----------------");
  }

}
