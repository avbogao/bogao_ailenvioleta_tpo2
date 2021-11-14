
package logica;

import igu.Principal;
import persistencia.ControladoraPersistencia;

public class Tpo2 {


    public static void main(String[] args) {
        //Cliente perrito2 = new Cliente(8,"Blinky","Ratonera","Marron",false,false,"Nehuen","12343242","observaciones");
        Controladora control = new Controladora();
        //control.crearCliente(perrito2);
        //perrito2.setAlergico(true);
        //control.modificarCliente(perrito2);
        //control.eliminarCliente(perrito2);
        
        Principal principal = new Principal(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
    
}
