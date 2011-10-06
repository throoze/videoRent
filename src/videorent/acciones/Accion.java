package videorent.acciones;

/**
 * Representa una acción a registrar en el sistema de VideoRent.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public interface Accion {
    /**
     * Devuelve el identificador de la acción.
     * @return el identificador de la acción.
     */
    public char getId();
}
