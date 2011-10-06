package videorent.acciones;

import fiscal.TarjetaCredito;

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
    private TarjetaCredito tarjeta;

    /**
     * Construye una nueva acción de tipo ActualizarTarjeta, bajo la información
     * suministrada.
     *
     * @param codCliente código del cliente cuya tarjeta será actualizada.
     * @param tarjeta {@code TarjetaCredito} con los datos actualizados.
     */
    public ActualizarTarjeta(String codCliente, TarjetaCredito tarjeta){
        super('t');
        this.codCliente = codCliente;
        this.tarjeta = tarjeta;
    };

    /**
     * Devuelve el código del cliente cuyos datos se desean actualizar.
     * @return código del cliente cuyos datos se desean actualizar.
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Devuelve una tarjeta de crédito con los datos actualizados.
     * @return tarjeta de crédito con los datos actualizados.
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
}
