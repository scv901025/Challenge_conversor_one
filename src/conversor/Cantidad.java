
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
class Cantidad {
    
    private double valor = 0;

    protected double valorConversion() {
        
    while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir ");
                if (input == null) {
                    // Si el usuario cancela o cierra el diálogo, salimos del programa.
                    System.exit(0);
                }
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                // Si ocurre un error al convertir el valor a double, mostramos un mensaje de error y pedimos nuevamente el valor.
                JOptionPane.showMessageDialog(null, "Valor no válido. Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
