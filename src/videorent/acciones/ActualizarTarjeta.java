package videorent.acciones;

import videorent.fiscal.TarjetaCredito;

/**
 * Representa la acción de actualizar los datos de la tarjeta de credito
 * realizada por el cliente
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */

public class ActualizarTarjeta extends AccionCliente {

    private String codCliente;
    private TarjetaCredito tarjeta;
    /**
     * Constructor de la clase ActualizaTarjeta
     * @param codCliente El código del cliente
     * @param tarjeta La tarjeta de crédito
     * @param id El código de la acción
     */
    public ActualizarTarjeta(String codCliente, TarjetaCredito tarjeta, char id){
        super(id);
        this.codCliente = codCliente;
        this.tarjeta = tarjeta;
    };
    /**
     * Getter del atributo codCliente
     * @return El código del cliente
     */
    public String getCodCliente() {
        return codCliente;
    }
    /**
     * Getter del atributo tarjeta
     * @return La tarjeta de crédito asociada
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
}
