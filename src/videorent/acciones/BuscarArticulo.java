/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

/**
 * Representa la acción que realiza un empleado para buscar un artículo
 * alquilado por algún cliente con membresía premium.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class BuscarArticulo extends AccionEmpleado {
    private String codCliente;
    private String codArtículo;

    /**
     * Construye una nueva acción del tipo BuscarArticulo, en base a la
     * información suministrada.
     * @param codCliente código del cliente que ordenó la búsqueda
     * @param codArtículo código del artículo a buscar.
     */
    public BuscarArticulo(String codCliente, String codArtículo) {
        super('b');
        this.codCliente = codCliente;
        this.codArtículo = codArtículo;
    }

    /**
     * Devuelve el código del artículo a buscar
     * @return el código del artículo a buscar
     */
    public String getCodArtículo() {
        return codArtículo;
    }

    /**
     * Devuelve el código del cliente que tiene el artículo a buscar.
     * @return el código del cliente que tiene el artículo a buscar.
     */
    public String getCodCliente() {
        return codCliente;
    }
}
