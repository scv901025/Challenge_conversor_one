
package conversor;

import javax.swing.JOptionPane;
import java.math.RoundingMode;

/**
 *
 * @author USUARIO
 */
class Moneda {

    private final String items[]; 

    Moneda() {
        items = new String[]{"Peso Colombianos a Dólar", 
                             "Peso Colombianos a Euro", 
                             "Peso Colombianos a Libras Esterlina", 
                             "Peso Colombianos a Yen Japonés", 
                             "Peso Colombianos a Won Sul-Coreano",
                             
                             "Dólar a Peso Colombianos", 
                             "Euro a Peso Colombianos", 
                             "Libras Esterlina a Peso Colombianos", 
                             "Yen Japonés a Peso Colombianos", 
                             "Won Sul-Coreano a Peso Colombianos"};
    } 
    
    
    protected String seleccion() {
        
        return (String) JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir",
                "Conversor de Moneda",JOptionPane.DEFAULT_OPTION,null, items, items[0]);
    }
    
    public String conversion (String mOpcion, double cantidad){
        
        double resultado=0.0;
        String variable="";
        String mensaje="";
        
        switch (mOpcion) {
            case "Peso Colombianos a Dólar":
                resultado = cantidad / 3800; // Tasa de cambio dólar a pesos colombianos
                variable="dolares";
                break;
            case "Peso Colombianos a Euro":
                resultado = cantidad / 4450; // Tasa de cambio euro a pesos colombianos
                variable="Euros";
                break;
            case "Peso Colombianos a Libras Esterlina":
                resultado = cantidad / 5240; // Tasa de cambio libras esterlina a pesos colombianos
                variable="Libras Esterlinas";
                break;
            case "Peso Colombianos a Yen Japonés":
                resultado = cantidad / 35.4; // Tasa de cambio yen japonés a pesos colombianos
                variable="Yen Japones";
                break;
            case "Peso Colombianos a Won Sul-Coreano":
                resultado = cantidad / 0.0032; // Tasa de cambio won sul-coreano a pesos colombianos
                variable="Won Sul-Coreano";
                break;
            case "Dólar a Peso Colombianos":
                resultado = cantidad * 3800; // Tasa de cambio pesos colombianos a dólar
                variable="Pesos Colombianos";
                break;
            case "Euro a Peso Colombianos":
                resultado = cantidad * 4450; // Tasa de cambio pesos colombianos a euro
                variable="Pesos Colombianos";
                break;
            case "Libras Esterlina a Peso Colombianos":
                resultado = cantidad * 5240; // Tasa de cambio pesos colombianos a libras esterlina
                variable="Pesos Colombianos";
                break;
            case "Yen Japonés a Peso Colombianos":
                resultado = cantidad * 35.4; // Tasa de cambio pesos colombianos a yen japonés
                variable="Pesos Colombianos";
                break;
            case "Won Sul-Coreano a Peso Colombianos":
                resultado = cantidad * 0.0032; // Tasa de cambio pesos colombianos a won sul-coreano
                variable="Pesos Colombianos";
                break;
        }
        resultado=(Math.round(resultado*100));
        resultado=resultado/100;
        
        mensaje=resultado+" "+variable;
        return (mensaje);
    }
}
