package videorent.acciones;

/**
 * Representa la acción de abandonar la tienda realizada por un cliente.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class AbandonarTienda extends AccionCliente{
    private String codCliente;

    /**
     * Constructor de la clase AbandonarTienda
     * @param codCliente El código del cliente
     * @param id El código de la acción
     */
    public AbandonarTienda(String codCliente) {
        super('b');
        this.codCliente = codCliente;
    }

    /**
     * Devuelve el atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }
}