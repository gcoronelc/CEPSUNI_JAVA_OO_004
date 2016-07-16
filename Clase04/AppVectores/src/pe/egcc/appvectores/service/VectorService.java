package pe.egcc.appvectores.service;

import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VectorService {
  
  public void generarVector(int m, int n, int t){
    Datos.vector = new int[t];
    Random rnd = new Random();
    int x =  n - m - 1; 
    for (int i = 0; i < t; i++) {
      Datos.vector[i] = rnd.nextInt(x) + m + 1;
    }
  }
  
  public int[] getVector(){
    return Datos.vector;
  }
  
  public int getCantPares(){
    if(Datos.vector == null){
      return 0;
    }
    int cont = 0;
    for(int n: Datos.vector){
      if(n % 2 == 0){
        cont++;
      }
    }
    return cont;
  }
  
  public int getCantInpares(){
    if(Datos.vector == null){
      return 0;
    }
    int cont = 0;
    for(int n: Datos.vector){
      if(n % 2 == 1){
        cont++;
      }
    }
    return cont;
  }
  
  public int getSuma(){
    if(Datos.vector == null){
      return 0;
    }
    int suma = 0;
    for(int n: Datos.vector){
      suma += n;
    }
    return suma;
  }
  
  public int getMedia(){
    if(Datos.vector == null){
      return 0;
    }
    int media = getSuma() / Datos.vector.length;
    return media;
  }
  
}
