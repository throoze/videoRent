/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class CambiarEstado extends AccionEmpleado {
    private String codCliente;
    private String estado;

    /**
     * Construye una nueva acción del tipo Registrar asociado, basado en la
     * información suministrada.
     *
     * @param codCliente código del cliente
     * @param estado nuevo estado del cliente
     */
    public CambiarEstado(String codCliente, String estado) {
        super('c');
        this.codCliente = codCliente;
        this.estado = estado;
    }

    /**
     * Devuelve el código del cliente a modificar.
     * @return el código del cliente a modificar.
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve el nuevo estado del cliente.
     * @return el nuevo estado del cliente.
     */
    public String getEstado() {
        return estado;
    }
}
