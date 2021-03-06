package videorent.acciones;

/**
 * Representa la acción que realiza un empleado para cambiar los datos de la
 * tarjeta de crédito de un cliente asociado.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class CambiarTarjeta extends AccionEmpleado {
    private String codCliente;

    /**
     * Construye una nueva acción del tipo CambiarTarjeta, que cambia los datos
     * de la tarjeta del cliente {@code codCliente}.
     *
     * @param codCliente código del cliente a modificar
     */
    public CambiarTarjeta(String codCliente) {
        super('t');
        this.codCliente = codCliente;
    }

    /**
     * Devuelve el código del cliente a modificar.
     * @return el código del cliente a modificar.
     */
    public String getCodCliente() {
        return codCliente;
    }
}