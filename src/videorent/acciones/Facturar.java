package videorent.acciones;

/**
 * Representa la acción que realiza un empleado para  generar la facturación
 * para determinado cliente.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class Facturar extends AccionEmpleado {
    private String codCliente;
    private double motoCobrado;

    /**
     * Construye una nueva acción del tipo Facturar según la información
     * suministrada.
     *
     * @param codCliente código del cliente a facturar.
     * @param motoCobrado monto cobrado al cliente
     */
    public Facturar(String codCliente, double motoCobrado) {
        super('f');
        this.codCliente = codCliente;
        this.motoCobrado = motoCobrado;
    }

    /**
     * Devuelve el código del cliente a facturar.
     * @return el código del cliente a facturar.
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve el moto cobrado en esta {@code Facturación}
     * @return el moto cobrado en esta {@code Facturación}
     */
    public double getMotoCobrado() {
        return motoCobrado;
    }
}
