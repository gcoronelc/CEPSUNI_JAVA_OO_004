package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    Producto bean = new Producto();
    
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Color: " + bean.getColor());
    System.out.println("Forma: " + bean.getForma());
    System.out.println("Activo: " + bean.isActivo());
    
  }
}
