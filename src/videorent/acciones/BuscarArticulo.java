package videorent.acciones;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
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

    public String getCodArtículo() {
        return codArtículo;
    }

    public String getCodCliente() {
        return codCliente;
    }
}
