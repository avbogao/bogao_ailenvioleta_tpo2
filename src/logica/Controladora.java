
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();
     
    public void crearCliente(String nombrePerro, String raza, String color, String nombreDuenio, 
        String celDuenio, boolean alergico, boolean atencionEspecial, String observaciones){
        Cliente cli = new Cliente();
        cli.setAlergico(alergico);
        cli.setAtención_especial(atencionEspecial);
        cli.setCelular_duenio(celDuenio);
        cli.setColor(color);
        cli.setNombre_duenio(nombreDuenio);
        cli.setNombre_perro(nombrePerro);
        cli.setRaza(raza);
        cli.setObservaciones(observaciones);
        
        controlpersis.crearCliente(cli);
    }
    public void crearCliente(Cliente cli){
        controlpersis.crearCliente(cli);
    }
    public void eliminarCliente(Cliente cli){
        controlpersis.eliminarCliente(cli);
    }
    public void eliminarCliente(int id){
       controlpersis.eliminarCliente(id);
    }    
    public List<Cliente> traerClientes(){
       return controlpersis.obtenerClientes();
    }
    public void modificarCliente(Cliente cli){
        controlpersis.modificarCliente(cli);
    }
    public Cliente buscarCliente(Cliente cli){
        return controlpersis.buscarCliente(cli);
    }
    public Cliente buscarCliente(int id){
       return controlpersis.buscarCliente(id);
    }
}
