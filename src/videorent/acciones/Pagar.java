/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class Pagar extends AccionCliente{
    private String codCliente;
    private double montoEntregado;

    public Pagar(String codCliente, double montoEntregado, char id) {
        super(id);
        this.codCliente = codCliente;
        this.montoEntregado = montoEntregado;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public double getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }
}
