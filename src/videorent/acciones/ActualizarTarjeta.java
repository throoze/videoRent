package videorent.acciones;

import java.util.Date;

/**
 * Representa la acción que realiza un cliente para actualizar los datos de su
 * tarjeta de crédito.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 10.06.2011
 */
public class ActualizarTarjeta extends AccionCliente {

    private String codCliente;
    private long numTarjeta;
    private String banco;
    private int codSeguridad;
    private String vencimiento;

    /**
     * Construye una nueva acción de tipo ActualizarTarjeta, bajo la información
     * suministrada.
     *
     * @param codCliente código del cliente dueño de la tarjeta.
     * @param numTarjeta número de la tarjeta
     * @param banco banco de la tarjeta
     * @param codSeguridad código de seguridad de la tarjeta.
     * @param vencimiento fecha de vencimiento de la tarjeta.
     */
    public ActualizarTarjeta(String codCliente, long numTarjeta, String banco,
            int codSeguridad, String vencimiento) {
        super('t');
        this.codCliente = codCliente;
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.codSeguridad = codSeguridad;
        this.vencimiento = vencimiento;
    }

    /**
     * Devuelve el código del cliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve el banco de la tarjeta
     * @return el banco de la tarjeta
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Devuelve el código de seguridad de la tarjeta
     * @return el código de seguridad de la tarjeta
     */
    public int getCodSeguridad() {
        return codSeguridad;
    }

    /**
     * Devuelve el número de la tarjeta
     * @return el número de la tarjeta
     */
    public long getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Devuelve la fecha de vencimiento de la tarjeta.
     * @return la fecha de vencimiento de la tarjeta.
     */
    public String getVencimiento() {
        return vencimiento;
    }
}