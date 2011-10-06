package videorent.acciones;

/**
 * Representa la acción que realiza un cliente de la tienda VideoRent de llevar
 * a la caja un artículo para su compra.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class LlevarParaCompra extends AccionCliente{
    private String codCliente;
    private String cedula;
    private String nombre;
    private String telefono;
    private String codArticulo;

    /**
     * Construye una nueva acción del tipo LlevarParaCompra relacionado con un
     * cliente Asociado a la tienda.
     *
     * @param codCliente cliente que realiza la compra.
     * @param codArticulo artículo que se compra.
     */
    public LlevarParaCompra(String codCliente, String codArticulo) {
        super('c');
        this.codCliente = codCliente;
        this.codArticulo = codArticulo;
        this.cedula = null;
        this.nombre = null;
        this.telefono = null;
    }

    /**
     * Construye una nueva acción del tipo LlevarParaCompra relacionado con un
     * cliente no Asociado a la tienda.
     *
     * @param cedula
     * @param nombre
     * @param telefono
     * @param codArticulo
     */
    public LlevarParaCompra(String cedula, String nombre, String telefono,
            String codArticulo) {
        super('c');
        this.codCliente = null;
        this.codArticulo = codArticulo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Devuelve el código del artículo a comprar.
     * @return el código del artículo a comprar.
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     * Devuelve el código del cliente que va a comprar el artículo.
     * @return el código del cliente que va a comprar el artículo.
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve la cédula del cliente.
     *
     * @return la cédula del cliente.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Devuelve el nombre del cliente.
     *
     * @return el nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el teléfono del cliente.
     *
     * @return el teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }
}