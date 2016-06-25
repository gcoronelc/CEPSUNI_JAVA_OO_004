package pe.egcc.mateapp.service;

import pe.egcc.mateapp.dto.MateDto;

public class MateService {
  
  public void procesarDatos(MateDto mateDto){
    // Variables
    int suma, prod;
    // Proceso
    suma = mateDto.getNum1() + mateDto.getNum2();
    prod = mateDto.getNum1() * mateDto.getNum2();
    // Reporte
    mateDto.setSuma(suma);
    mateDto.setProd(prod);
  }
  
}
