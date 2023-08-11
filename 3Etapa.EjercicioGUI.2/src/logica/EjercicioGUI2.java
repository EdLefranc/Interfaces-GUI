
package logica;

import igu.ConvertorVista;
import javax.swing.JFrame;

/**
 *Ejercicio 2:
Crea una aplicación GUI en Java que simule un convertidor de unidades de temperatura. La
interfaz debe contener los siguientes elementos:
1. Un campo de texto (JTextField) para que el usuario pueda ingresar la temperatura en grados
Celsius.
2. Un botón (JButton) con el texto "Convertir".
Cuando el usuario ingrese la temperatura en grados Celsius y haga clic en el botón "Convertir", la
aplicación debe realizar la conversión de Celsius a Fahrenheit y mostrar el resultado en un cuadro
de diálogo emergente.
La fórmula para convertir de grados Celsius a Fahrenheit es: Fahrenheit = Celsius * 9/5 + 32.
Recuerda utilizar la biblioteca de componentes gráficos de Java (Swing) para crear la interfaz y
gestionar el evento del botón.
 * @author Cristian
 */
public class EjercicioGUI2 {

   
    public static void main(String[] args) {
       
        ConvertorVista t = new ConvertorVista();
        
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
