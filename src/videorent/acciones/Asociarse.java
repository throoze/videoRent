/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

import cliente.Cliente;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class Asociarse extends AccionCliente{
    private Cliente cliente; 
    private String tipoMembresia;

    public Asociarse(Cliente cliente, String tipoMembresia, char id) {
        super(id);
        this.cliente = cliente;
        this.tipoMembresia = tipoMembresia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    
}
