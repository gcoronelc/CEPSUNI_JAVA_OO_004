package pe.egcc.becaapp.prueba;

import pe.egcc.becaapp.service.BecaService;
import pe.egcc.becaapp.util.BecaUtil;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    double importe;
    BecaService service = new BecaService();
    importe = service.getImporte
        (BecaService.CAT_ESTUDIOS, BecaService.PROD_PREGRADO);
    System.out.println("Importe: " + importe);
  }
}
