package pe.egcc.ventas.domain;

/**
 * Representa la venta de un producto.
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Venta {
  
  private String cliente;
  private String producto;
  private double precio;
  private int cant;
  private double importe;

  public Venta() {
  }

  public Venta(String cliente, String producto, double precio, int cant, double importe) {
    this.cliente = cliente;
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
  
  
  
}
