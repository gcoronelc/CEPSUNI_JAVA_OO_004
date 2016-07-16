package pe.egcc.appvectores.prueba;

import pe.egcc.appvectores.service.VectorService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    VectorService service = new VectorService();
    // Generando el vector
    service.generarVector(10, 30, 10);
    // Mostrar el vector
    System.out.println("Vector:");
    for(int n: service.getVector()){
      System.out.println(n);
    }
    // Estadistica
    System.out.println("ESTADISTICA");
    System.out.println("Cant. Pares: " + service.getCantPares());
    System.out.println("Cant. Inpares: " + service.getCantInpares());
    System.out.println("Suma: " + service.getSuma());
    System.out.println("Media: " + service.getMedia());
  }
}
