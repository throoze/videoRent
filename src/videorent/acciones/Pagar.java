package videorent.acciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Representa la acción que realiza un cliente para efectuar un pago a la tienda
 * VideoRent.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 0.1 - 06.10.2011
 */
public class Pagar extends AccionCliente{
    private String codCliente;
    private String cedula;
    private double montoEntregado;

    /**
     * Constructor de la clase Pagar. Diferencia entre si el cliente esta
     * asociado, o no.
     *
     * @param codCliente El código del cliente o la cédula, en caso de no ser
     * asociado.
     * @param montoEntregado El monto entregado en la caja
     */
    public Pagar(String codCliente, double montoEntregado) {
        super('p');
        Pattern p = Pattern.compile("^[BP]d{4}$");
        Matcher m = p.matcher(codCliente);
        if (m.matches()){
            this.cedula = null;
            this.codCliente = codCliente;
        } else {
            this.cedula = codCliente;
            this.codCliente = null;
        }
        this.montoEntregado = montoEntregado;
    }

    /**
     * Devuelve el atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Establece el atributo codCliente
     * @param codCliente El código del cliente
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * Devuelve el atributo montoEntregado
     * @return El monto entregado en caja
     */
    public double getMontoEntregado() {
        return montoEntregado;
    }

    /**
     * Establece el atributo montoEntregado
     * @param montoEntregado El monto entregado en caja
     */
    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    /**
     * Devuelve la cédula del cliente no asociado que ejecuta esta acción.
     *
     * @return la cédula del cliente no asociado que ejecuta esta acción.
     */
    public String getCedula() {
        return cedula;
    }
}