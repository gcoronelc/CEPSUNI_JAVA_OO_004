package pe.egcc.becaapp.service;

import pe.egcc.becaapp.dto.BecaDto;

public class BecaService {

  // Categorias
  public static final String CAT_ESTUDIOS = "ESTUDIOS";
  public static final String CAT_TESIS = "TESIS";
  
  // Productos
  public static final String PROD_PREGRADO = "PREGRADO";
  public static final String PROD_MAESTRIA = "MAESTRIA";
  public static final String PROD_DOCTORADO = "DOCTORADO";
  
  // Meses
  public static final String MES_06 = "06 Meses";
  public static final String MES_12 = "12 Meses";
  public static final String MES_18 = "18 Meses";
  
  
  public String[] getCategorias(){
    String[] lista = {CAT_ESTUDIOS,CAT_TESIS};
    return lista;
  }
  
  public String[] getProductos(){
    String[] lista = {PROD_PREGRADO,PROD_MAESTRIA,PROD_DOCTORADO};
    return lista;
  }
  
  public String[] getMeses(){
    String[] lista = {MES_06,MES_12,MES_18};
    return lista;
  }
  
  public double getImporte(String cat, String prod){
    double importe = 0;
    switch(cat){
      case CAT_ESTUDIOS:
        switch(prod){
          case PROD_PREGRADO: importe = 10000.0; break;
          case PROD_MAESTRIA: importe = 15000.0; break;
          case PROD_DOCTORADO: importe = 25000.0; break;
        }
        break;
      case CAT_TESIS:
        switch(prod){
          case PROD_PREGRADO: importe = 5000.0; break;
          case PROD_MAESTRIA: importe = 8000.0; break;
          case PROD_DOCTORADO: importe = 12000.0; break;
        }
        break;
    }
    return importe;
  }
  
  public double getFactor(String meses){
    double factor = 0;
    switch(meses){
      case MES_06: factor = 0.07; break;
      case MES_12: factor = 0.12; break;
      case MES_18: factor = 0.17; break;
    }
    return factor;
  }
  
  public int getMeses(String meses){
    int value = 0;
    switch(meses){
      case MES_06: value = 6; break;
      case MES_12: value = 12; break;
      case MES_18: value = 17; break;
    }
    return value;
  }
  
  public void doProcesar(BecaDto dto){
    // Variables
    double importe, valorCuota, factor, porcInteres;
    int meses;
    // Proceso
    importe = getImporte(dto.getCategoria(), dto.getProducto());
    meses = getMeses(dto.getMeses());
    factor = getFactor(dto.getMeses());
    valorCuota = importe * (1 + factor)/meses;
    porcInteres = factor * 100.0;
    // Reporte
    dto.setImporte(importe);
    dto.setPorcInteres(porcInteres);
    dto.setValorCuota(valorCuota);
  }
  
}
