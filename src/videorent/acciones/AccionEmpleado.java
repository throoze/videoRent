package videorent.acciones;

/**
 * Representa una acción a procesar por el sistema de VideoRent, realizada por
 * un empleado de la tienda.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 06.10.2011
 */
public class AccionEmpleado implements Accion {
    /**
     * Identifica la acción leída. Usamos un caracter, para evitar el uso del
     * operador {@code instanceof}, debido a que tiene alto impacto en el
     * desempeño de la aplicación.
     */
    protected char id;

    /**
     * Construye una AccionCliente vacía.
     * @param id Identificador de la acción.
     */
    public AccionEmpleado(char id){
        this.id = id;
    }

    /**
     * Devuelve el identificador de la acción.
     * @return el identificador de la acción.
     */
    @Override
    public char getId(){
        return this.id;
    }
}