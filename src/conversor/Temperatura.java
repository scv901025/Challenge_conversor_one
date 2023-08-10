
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
class Temperatura {
    
    private final String items[];   

    Temperatura() {   
        items = new String[]{"Centigrados a Fahrenheit", 
                             "Centigrados a Kelvin", 
                             "Fahrenheit a Centigrados", 
                             "Kelvin a Centigrados"};
    }
    
    
    protected String seleccion() {
        
        return (String) JOptionPane.showInputDialog(null, "Elige la unidad de medida a la que deseas convertir", 
                "Conversor de Temperatura",JOptionPane.DEFAULT_OPTION,null, items, items[0]);
    }

    public String conversion(String tOpcion, double cantidad) {
        
        double resultado=0.00;
        String variable="";
        String mensaje="";
        
        switch (tOpcion) {
                case "Centigrados a Fahrenheit":
                    resultado = (cantidad * 9/5) + 32;
                    variable="Fahrenheit";
                    break;
                case "Centigrados a Kelvin":
                    resultado = cantidad + 273.15;
                    variable="Kelvins";
                    break;
                case "Fahrenheit a Centigrados":
                    resultado = (cantidad - 32) * 5/9;
                    variable="Centigrados";
                    break;
                case "Kelvin a Centigrados":
                    resultado = cantidad - 273.15;
                    variable="Centigrados";
                    break;
        }
        resultado=(Math.round(resultado*100));
        resultado=resultado/100;
        mensaje=resultado+" "+variable;
        return (mensaje);
    }
}

