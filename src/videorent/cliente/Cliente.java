package videorent.cliente;

/**
 * Representa a un cliente de la tienda VideoRent.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 0.1 - 04.10.2011
 */
public class Cliente {
    protected String cedula;
    protected String nombre;
    protected String telefono;

    /**
     * Construye un nuevo @code{Cliente} con la información suministrada.
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     */
    public Cliente(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.telefono = telefono;
    }

    /**
     * Devuelve la cédula de identidad del @code{Cliente}
     * @return Cédula de identidad del @code{Cliente}
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece un valor para la cédula de identidad del @code{Cliente}
     * @param cedula Cédula de identidad del @code{Cliente}
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Devuelve el nombre del @code{Cliente}
     * @return nombre del @code{Cliente}
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un valor para el nombre del @code{Cliente}
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el teléfono del @code{Cliente}
     * @return teléfono del @code{Cliente}
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece un valor para el teléfono del @code{Cliente}
     * @param telefono Teléfono del @code{Cliente}
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}