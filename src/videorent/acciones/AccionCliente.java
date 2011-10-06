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
public class AccionCliente implements Accion {
    /**
     * Identifica la acción leída. Usamos un caracter, para evitar el uso del
     * operador {@code instanceof}, debido a que tiene alto impacto en el
     * desempeño de la aplicación.
     */
    public char id;

    /**
     * Construye una AccionCliente vacía.
     * @param id Identificador de la acción.
     */
    public AccionCliente(char id){
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