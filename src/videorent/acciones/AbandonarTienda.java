package videorent.acciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private String cedula;

    /**
     * Constructor de la clase AbandonarTienda. Diferencia entre si lo hace un
     * cliente asociado o uno no asociado.
     *
     * @param codCliente El código del cliente
     * @param id El código de la acción
     */
    public AbandonarTienda(String codCliente) {
        super('b');
        Pattern p = Pattern.compile("^[BP]d{4}$");
        Matcher m = p.matcher(codCliente);
        if (m.matches()) {
            this.codCliente = codCliente;
            this.cedula = null;
        } else {
            this.cedula = codCliente;
            this.codCliente = null;
        }
    }

    /**
     * Devuelve el código del cliente que abandona la tienda en caso de ser un
     * cliente asociado. En caso de no estar asociado, devuelve {@code null}.
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve la cédula del cliente que abandona la tienda, en caso de que no
     * esté asociado. Si se trata de un cliente asociado, devuelve {@code null}.
     *
     * @return la cédula del cliente que abandona la tienda, en caso de que no
     * esté asociado. Si se trata de un cliente asociado, devuelve {@code null}.
     */
    public String getCedula() {
        return cedula;
    }
}