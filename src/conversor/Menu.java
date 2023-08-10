package conversor;

import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
class Menu {

    private final  String items[];   

    Menu() {   
        items = new String[]{"Conversor de moneda",
                                  "conversor de temperatura", 
                                  "conversor de distancia"};
    }
    
    
    public String seleccion() {
        
        return (String) JOptionPane.showInputDialog(null, 
                "Elige el conversor",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                null,
                items,
                items[0]);
    }
    
}
