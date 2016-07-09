package pe.egcc.becaapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class BecaDto {
  
  // Datos
  private String categoria;
  private String producto;
  private String meses;
  // Calcular
  private double importe;
  private double porcInteres;
  private double valorCuota;

  public BecaDto() {
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public String getMeses() {
    return meses;
  }

  public void setMeses(String meses) {
    this.meses = meses;
  }

  

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getPorcInteres() {
    return porcInteres;
  }

  public void setPorcInteres(double porcInteres) {
    this.porcInteres = porcInteres;
  }

  public double getValorCuota() {
    return valorCuota;
  }

  public void setValorCuota(double valorCuota) {
    this.valorCuota = valorCuota;
  }
  
  
  
  
  
  
}
