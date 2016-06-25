
package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.dto.MateDto;
import pe.egcc.mateapp.service.MateService;


public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    MateDto mateDto = new MateDto();
    mateDto.setNum1(17);
    mateDto.setNum2(7);
    // Proceso
    MateService mateService = new MateService();
    mateService.procesarDatos(mateDto);
    // Reporte
    System.out.println("Suma: " + mateDto.getSuma());
    System.out.println("Producto: " + mateDto.getProd());
  }
}
