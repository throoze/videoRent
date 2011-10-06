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
public class RecordarDevolucion extends AccionEmpleado {
    private String codAsociado;

    /**
     * Construye una nueva acción de tipo RecordarDevolucion, bajo la
     * información suministrada.
     * @param codAsociado código del asociado a quien recordarle.
     */
    public RecordarDevolucion(String codAsociado) {
        super('l');
        this.codAsociado = codAsociado;
    }

    /**
     * Devuelve el código del asociado a quien se le recordará.
     * @return código del asociado a quien se le recordará.
     */
    public String getCodAsociado() {
        return codAsociado;
    }
}
