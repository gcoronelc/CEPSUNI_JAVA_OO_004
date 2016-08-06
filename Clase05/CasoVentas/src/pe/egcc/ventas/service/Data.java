package pe.egcc.ventas.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventas.domain.Venta;

/**
 * Representa el repositorio.
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
final class Data {

  /**
   * Constructor private para que no se pueda instanciar.
   */
  private Data() {
  }

  static List<Venta> ventas;
  
  static {
    ventas = new ArrayList<>();
  }
  
}
