/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

/**
 * Representa la accion pagar de un cliente
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class Pagar extends AccionCliente{
    private String codCliente;
    private double montoEntregado;
    /**
     * Constructor de la clase Pagar
     * @param codCliente El código del cliente
     * @param montoEntregado El monto entregado en la caja
     * @param id El codigo de la acción
     */
    public Pagar(String codCliente, double montoEntregado, char id) {
        super(id);
        this.codCliente = codCliente;
        this.montoEntregado = montoEntregado;
    }
    /**
     * Getter del atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }
    /**
     * Setter del atributo codCliente
     * @param codCliente El código del cliente
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    /**
     * Getter del atributo montoEntregado
     * @return El monto entregado en caja
     */
    public double getMontoEntregado() {
        return montoEntregado;
    }
    /**
     * Setter del atributo montoEntregado
     * @param montoEntregado El monto entregado en caja
     */
    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }
}
