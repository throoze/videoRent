
package videorent.acciones;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class RegistrarAsociado extends AccionEmpleado {
    private String codAsociado;

    /**
     * Construye una nueva acción, del tipo Registrar asociado, de acuerdo a la
     * información suministrada.
     *
     * @param codAsociado
     */
    public RegistrarAsociado(String codAsociado) {
        super('r');
        this.codAsociado = codAsociado;
    }

    /**
     * Devuelve el código del asociado.
     * @return el código del asociado.
     */
    public String getCodAsociado() {
        return codAsociado;
    }

    /**
     * Establece el valor del código del asociado
     * @param codAsociado valor del código del asociado
     */
    public void setCodAsociado(String codAsociado) {
        this.codAsociado = codAsociado;
    }
}