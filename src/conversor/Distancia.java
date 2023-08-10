
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
class Distancia {
    
    private final String items[];   

    Distancia() {   
        items = new String[]{"Metro a Kilometro", 
                             "Metro a Yardas", 
                             "Metro a Pies", 
                             "Metro a Milla", 
                             "Metro a Pulgada",
                             
                             "Kilometro a Metro", 
                             "Yardas a Metro", 
                             "Pies a Metro", 
                             "Milla a Metro", 
                             "Pulgada a Metro"};
    }
    
    
    protected String seleccion() {
        
        return (String) JOptionPane.showInputDialog(null, "Elige la unidad de medida a la que deseas convertir",
                "Conversor de Distancia",JOptionPane.DEFAULT_OPTION,null, items, items[0]);
    }

    public String conversion(String dOpcion, double cantidad) {
       
        double resultado=0.0;
        String variable="";
        String mensaje="";
        
        switch (dOpcion) {
            case "Metro a Kilometro":
                resultado = cantidad / 1000.0;
                variable="kilometros";
                break;
            case "Metro a Yardas":
                resultado = cantidad * 1.09361;
                variable="yardas";
                break;
            case "Metro a Pies":
                resultado = cantidad * 3.28084;
                variable="pies";
                break;
            case "Metro a Milla":
                resultado = cantidad * 0.000621371;
                variable="millas";
                break;
            case "Metro a Pulgada":
                resultado = cantidad * 39.3701;
                variable="pulgadas";
                break;
            case "Kilometro a Metro":
                resultado = cantidad * 1000.0;
                variable="metros";
                break;
            case "Yardas a Metro":
                resultado = cantidad / 1.09361;
                variable="metros";
                break;
            case "Pies a Metro":
                resultado = cantidad / 3.28084;
                variable="metros";
                break;
            case "Milla a Metro":
                resultado = cantidad / 0.000621371;
                variable="metros";
                break;
            case "Pulgada a Metro":
                resultado = cantidad / 39.3701;
                variable="metros";
                break;
        }
        resultado=(Math.round(resultado*100));
        resultado=resultado/100;
        
        mensaje=resultado+" "+variable;
        return (mensaje);
         
    }
}
