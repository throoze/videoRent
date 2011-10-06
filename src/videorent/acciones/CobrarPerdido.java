/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

/**
 * Representa la acción que realiza un empleado para cobrar el monto
 * correspondiente a un artículo perdido.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class CobrarPerdido extends AccionEmpleado {
    private String codCliente;
    private String codArticulo;

    /**
     * Construye una nueva acción del tipo CobrarPerdido
     *
     * @param codCliente código del cliente a facturar
     * @param codArticulo código del artículo perdido
     */
    public CobrarPerdido(String codCliente, String codArticulo) {
        super('p');
        this.codCliente = codCliente;
        this.codArticulo = codArticulo;
    }

    /**
     * Devuelve el código del artículo perdido.
     *
     * @return código del artículo perdido
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     * Devuelve el código del cliente a facturar.
     *
     * @return código del cliente a facturar
     */
    public String getCodCliente() {
        return codCliente;
    }
}
