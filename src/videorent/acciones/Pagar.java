package videorent.acciones;

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
    private double montoEntregado;

    /**
     * Constructor de la clase Pagar
     * @param codCliente El código del cliente
     * @param montoEntregado El monto entregado en la caja
     */
    public Pagar(String codCliente, double montoEntregado) {
        super('p');
        this.codCliente = codCliente;
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
}