package videorent.acciones;

/**
 * Representa la acción de pedir que se recoja un artículo realizada por un cliente
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class PedirRecogerArticulo extends AccionCliente{
    private String codCliente;
    private String codArticulo;
    /**
     * Constructor de la clase PedirRecogerArticulo
     * @param codCliente El código del cliente
     * @param codArticulo El código del artículo
     * @param id El código de la acción
     */
    public PedirRecogerArticulo(String codCliente, String codArticulo, char id) {
        super(id);
        this.codCliente = codCliente;
        this.codArticulo = codArticulo;
    }
    /**
     * Getter del atributo codArticulo
     * @return El código del artículo
     */
    public String getCodArticulo() {
        return codArticulo;
    }
    /**
     * Getter del atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }

}
