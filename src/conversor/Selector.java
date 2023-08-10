
package conversor;
import javax.swing.JOptionPane;

public class Selector {

   
    public static void main(String[] args) {
       
        Cantidad cantidad= new Cantidad();
        Moneda moneda= new Moneda();
        Distancia distancia= new Distancia();
        Temperatura temperatura=new Temperatura();
        Menu menu= new Menu();
        int repetir;
      
        String totalConversion="";
         
       do {
            switch (menu.seleccion()){
                
                case "Conversor de moneda":          
                    totalConversion=moneda.conversion(moneda.seleccion(),cantidad.valorConversion());
                    
                    
                    break;

                case "conversor de temperatura": 
                    totalConversion=temperatura.conversion(temperatura.seleccion(),cantidad.valorConversion());
                    break;
                    
                case "conversor de distancia":
                    cantidad.valorConversion();
                    totalConversion=distancia.conversion(distancia.seleccion(),cantidad.valorConversion());
                    
                    break;
            }  
            JOptionPane.showMessageDialog(null, "tienes: " +totalConversion);
            repetir = JOptionPane.showConfirmDialog(null, "deseas realizar alguna otra conversion?");  
       } while (repetir==0);
       
       JOptionPane.showMessageDialog(null, "Programa Finalizado");
    }   
}
