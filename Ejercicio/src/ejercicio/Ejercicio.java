package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author AMKARA
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int Numero;

        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un  numero"));

        if (Numero % 10 == 0) {

        
        JOptionPane.showMessageDialog(null, "El  Numero"   + Numero +    "el  multioplo de  10");
        }
        else{
           JOptionPane.showMessageDialog(null,"El  numero  No  es  multiplo  de  10"); 
        }
    }

}
