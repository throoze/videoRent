/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent.acciones;

import fiscal.TarjetaCredito;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */

public class ActualizarTarjeta extends AccionCliente {

    private String codCliente;
    private TarjetaCredito tarjeta;

    public ActualizarTarjeta(char id, String codCliente, TarjetaCredito tarjeta){
        super(id);
        this.codCliente = codCliente;
        this.tarjeta = tarjeta;
    };

    public String getCodCliente() {
        return codCliente;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
}
