package pe.egcc.ventas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import pe.egcc.ventas.domain.Venta;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaService {
  
  private String[] productos = {"Coca Cola","Inka Cola", "Galleta Soda"};

  public String[] getProductos(){
    return productos;
  }
  
  public void doGrabarVenta(Venta venta){
    double importe;
    importe = venta.getPrecio() * venta.getCant();
    venta.setImporte(importe);
    Data.ventas.add(venta);
  }

  public List<Venta> getVentas() {
    return Data.ventas;
  }
  
  public List<Venta> getVentas(String producto) {
    List<Venta> listaAux = new ArrayList<>();
    Data.ventas.stream().filter(v -> v.getProducto().equals(producto))
            .forEach(v -> listaAux.add(v));
    return listaAux;
  }
  
}
