package videorent.cliente;

import cliente.Cliente;
import java.util.ArrayList;
import videorent.alquiler.Alquiler;

/**
 * Representa a los clientes que se han afiliado a VideoRent, los cuales pueden
 * realizar ciertas operaciones que un <code>Cliente</code> no puede.
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 04.10.2011
 * @see Cliente
 */
public class Asociado extends Cliente {
    /**
     * Código del cliente. Cadena de caracteres que consta de un (1) caracter
     * alfabético y cuatro (4) numéricos. El caracter alfabético representa la
     * membresía del @code{Asociado} y puede ser : 'B' => Membresía Básica, o
     * 'P' => Membresía Premium.
     */
    protected String codigo;

    /**
     * Membresía del Asociado. Puede ser : 'B' => Membresía Básica, o
     * 'P' => Membresía Premium.
     */
    protected char membresia;

    /**
     * Estado del @{Asociado}. Puede ser: 'A' => Activo, o 'S' => Suspendido
     */
    protected char estado;

    /**
     *
     */
    protected String direccion;

    /**
     * Lista de alquileres activos
     */
    private ArrayList<Alquiler> alquileresActivos;

    /**
     * Lista de alquileres vencidos.
     */
    private ArrayList<Alquiler> alquileresVencidos;

    /**
     * Construye un nuevo @code{Asociado}, vacío.
     */
    public Asociado() {
    }

    /**
     * Construye un nuevo @code{Asociado}, con la información suministrada. Los
     * parámetros son autoexplicativos.
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     */
    public Asociado(String cedula, String nombre, String apellido,
                String telefono) {
        super(cedula, nombre, apellido, telefono);
    }

    /**
     * Construye un nuevo @code{Asociado}, con la información suministrada.
     * Inicializa las listas vacías de alquileres asociados al @code{Asociado}.
     * Establece el estado del @{Asociado} a 'A' (Activo). Los parámetros no
     * comentados son autoexplicativos
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param codigo
     * @param membresia Puede ser:
     *                   'B' - Corresponde a la membresía Básica.
     *                   'P' - Corresponde a la membresía Premium.
     * @param direccion
     */
    public Asociado(String cedula, String nombre, String apellido,
            String telefono, String codigo, char membresia, String direccion){
        super(cedula, nombre, apellido, telefono);
        this.codigo = codigo;
        this.membresia = membresia;
        this.direccion = direccion;
        this.estado = 'A';
        this.alquileresActivos = new ArrayList<Alquiler>();
        this.alquileresVencidos = new ArrayList<Alquiler>();
    }

    /**
     * Devuelve la lista de alquileres activos
     * @return lista de alquileres activos
     */
    public ArrayList<Alquiler> getAlquileresActivos() {
        return alquileresActivos;
    }

    /**
     * Establece el valor de la lista de alquileres activos.
     * @param alquileresActivos
     */
    public void setAlquileresActivos(ArrayList<Alquiler> alquileresActivos) {
        this.alquileresActivos = alquileresActivos;
    }

    /**
     * Devuelve la lista de alquileres vencidos.
     * @return lista de alquileres vencidos
     */
    public ArrayList<Alquiler> getAlquileresVencidos() {
        return alquileresVencidos;
    }

    /**
     * Establece el valor de la lista de alquileres vencidos
     * @param alquileresVencidos
     */
    public void setAlquileresVencidos(ArrayList<Alquiler> alquileresVencidos) {
        this.alquileresVencidos = alquileresVencidos;
    }

    /**
     * Devuelve el código del @code{Asociado}
     * @return código del @code{Asociado}
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece un valor para el código del @code{Asociado}
     * @param codigo código del @code{Asociado}
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve la dirección del @code{Asociado}
     * @return dirección del @code{Asociado}
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece un valor para la dirección del @code{Asociado}
     * @param direccion dirección del @code{Asociado}
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el estado del @code{Asociado}
     * @return estado del @code{Asociado}
     */
    public char getEstado() {
        return estado;
    }

    /**
     * Establece un valor para el estado del @code{Asociado}
     * @param estado estado del @code{Asociado}
     */
    public void setEstado(char estado) {
        this.estado = estado;
    }

    /**
     * Devuelve la membresía del @code{Asociado}
     * @return membresía del @code{Asociado}
     */
    public char getMembresia() {
        return membresia;
    }

    /**
     * Establece un valor para la membresía del @code{Asociado}
     * @param membresia  membresía del @code{Asociado}
     */
    public void setMembresia(char membresia) {
        this.membresia = membresia;
    }
}