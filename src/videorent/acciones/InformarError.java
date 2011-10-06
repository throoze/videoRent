package videorent.acciones;

/**
 * Representa la acción que realiza un empleado para informar a un cliente
 * asociado acerca de algún error en el sistema.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class InformarError extends AccionEmpleado {
    private String codCliente;
    private int codError;

    /**
     * Construye una nueva acción del tipo InformarError.
     *
     * @param codCliente código del cliente a quien se le va a informar del
     * error.
     * @param codError código del error. Puede ser: 0 => 'Cliente no
     * registrado', 1 => 'artículo no está en existencia', 2 => 'acción no
     * permitida para este tipo de cliente', 3 => 'pago incompleto', 4 =>
     * 'pago de más', 5 => 'cliente ya registrado', 6 => 'cliente suspendido',
     * 7 => 'cualquier otra operación no válida'.
     */
    public InformarError(String codCliente, int codError) {
        super('i');
        this.codCliente = codCliente;
        this.codError = codError;
    }

    /**
     * Devuelve el código del cliente a quien se le informa del error.
     *
     * @return código del cliente a quien se le informa del error.
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve el código de error del cual se desea informar.
     *
     * @return código de error del cual se desea informar. Puede ser: 0 =>
     * 'Cliente no registrado', 1 => 'artículo no está en existencia', 2 =>
     * 'acción no permitida para este tipo de cliente', 3 => 'pago incompleto',
     * 4 => 'pago de más', 5 => 'cliente ya registrado', 6 => 'cliente
     * suspendido', 7 => 'cualquier otra operación no válida'.
     */
    public int getCodError() {
        return codError;
    }
}