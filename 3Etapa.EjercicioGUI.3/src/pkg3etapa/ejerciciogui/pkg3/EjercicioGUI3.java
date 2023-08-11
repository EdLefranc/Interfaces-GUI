
package pkg3etapa.ejerciciogui.pkg3;

import javax.swing.JFrame;

/**
 *Ejercicio 3:
Crea una aplicación GUI en Java que gestione una lista de productos. La interfaz debe contener
los siguientes elementos:
1. Un ComboBox (JComboBox) que permita al usuario seleccionar una categoría de producto
de una lista predefinida (por ejemplo, electrónica, ropa, alimentos, etc.).
2. Un botón "Agregar producto" (JButton) que permita al usuario agregar un nuevo producto
a la lista.
3. Una tabla (JTable) que muestre los productos agregados, con columnas para el nombre del
producto, la categoría y el precio.
Cuando el usuario seleccione una categoría en el ComboBox y haga clic en el botón "Agregar
producto", el programa debe permitir al usuario ingresar el nombre y el precio del producto en
campos de texto separados. Luego, debe agregar el producto a la tabla con la categoría
seleccionada.
Además, la tabla debe ser actualizada automáticamente cada vez que se agrega un nuevo producto.
 * @author Cristian
 */
public class EjercicioGUI3 {

   
    public static void main(String[] args) {
        
        Ejercicio3Vista ej = new Ejercicio3Vista();
        
        ej.setVisible(true);
        ej.setLocationRelativeTo(null);
        ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

}
