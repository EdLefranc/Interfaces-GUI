
package convertidor;

import javax.swing.JFrame;

/**
 *
 * @author Cristian
 */
public class CONVERTIDOR {

   
    public static void main(String[] args) {
       
        vistaConvertidor vista = new vistaConvertidor();
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
