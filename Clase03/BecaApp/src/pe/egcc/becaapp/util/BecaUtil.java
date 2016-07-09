package pe.egcc.becaapp.util;

import javax.swing.JComboBox;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class BecaUtil {

  private BecaUtil() {
  }
  
  public static void llenarCombo(JComboBox combo, Object[]   lista){
    combo.removeAllItems();
    for (Object o : lista) {
      combo.addItem(o);
    }
    combo.setSelectedIndex(-1);
  }
  
}
