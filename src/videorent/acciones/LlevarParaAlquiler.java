package videorent.acciones;

/**
 * Representa la acción que realiza un cliente de VideoRent  de llevar un
 * artículo a la caja para su alquiler.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class LlevarParaAlquiler extends AccionCliente{
    private String codCliente;
    private String codArticulo;

    /**
     * Construye una nueva acción del tipo LlevarParaAlquiler.
     *
     * @param codCliente código del cliente que va a alquilar.
     * @param codArticulo código del artículo a alquilar.
     */
    public LlevarParaAlquiler(String codCliente, String codArticulo) {
        super('r');
        this.codCliente = codCliente;
        this.codArticulo = codArticulo;
    }

    /**
     * Devuelve el código del artículo a alquilar.
     *
     * @return código del artículo a alquilar.
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     * Devuelve el código del cliente que va a alquilar.
     *
     * @return código del cliente que va a alquilar.
     */
    public String getCodCliente() {
        return codCliente;
    }
}