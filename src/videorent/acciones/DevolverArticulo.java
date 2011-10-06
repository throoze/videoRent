package videorent.acciones;

/**
 * Representa la acción de devolver un articulo realizada por un cliente.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class DevolverArticulo extends AccionCliente{
    private String codCliente;
    private String codArticulo;

    /**
     * Constructor de la clase DevolverArticulo
     *
     * @param codCliente El código del cliente
     * @param codArticulo El código del artículo
     * @param id El código de la acción
     */
    public DevolverArticulo(String codCliente, String codArticulo) {
        super('d');
        this.codCliente = codCliente;
        this.codArticulo = codArticulo;
    }

    /**
     * Devuelve el atributo codArticulo
     *
     * @return El código del artículo
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     * Devuelve el atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }
}