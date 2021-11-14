
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    ClienteJpaController cli = new ClienteJpaController();
    
    public void crearCliente(Cliente client){
        try {
            cli.create(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     //baja
    public void eliminarCliente(int id){
        try {
            cli.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarCliente(Cliente client){
        try {
            cli.destroy(client.getNum_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //lectura
    public List<Cliente> obtenerClientes(){
       return cli.findClienteEntities();
    }
    //modificacion
    public void modificarCliente(Cliente client){
        try {
            cli.edit(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //busqueda
    public Cliente buscarCliente(Cliente client){
        return cli.findCliente(client.getNum_cliente());
    }
    
    public Cliente buscarCliente(int id){
        return cli.findCliente(id);
    } 
    
}
