package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Producto {
  
  private String nombre;
  private String color;
  private String forma;
  private boolean activo;

  public Producto() {
    this.nombre = "Papaya";
    this.color = "Amarilla";
    this.forma = "Ovalada";
    this.activo = true;
  }
  
  
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getForma() {
    return forma;
  }

  public void setForma(String forma) {
    this.forma = forma;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
