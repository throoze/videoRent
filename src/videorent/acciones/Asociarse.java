package videorent.acciones;

/**
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version
 */
public class Asociarse extends AccionCliente{
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String numTarjeta;
    private String banco;
    private String codSeguridad;
    private String fechaVencimiento;
    private String tipoMembresia;
    /**
     * Constructor de la clase Asociarse
     * @param cedula La cédula del cliente
     * @param nombre El nombre del cliente
     * @param apellido El apellido del cliente
     * @param telefono El telefono del cliente
     * @param dirección La dirección del cliente
     * @param numTarjeta El numero de la tarjeta
     * @param banco El nombre del banco
     * @param codSeguridad El codigo de seguridad
     * @param fechaVencimiento La fecha de vencimiento
     * @param tipoMembresia El tipo de membresía del cliente
     */
    public Asociarse(String cedula, String nombre, String apellido, String telefono, String direccion, String numTarjeta, String banco, String codSeguridad, String fechaVencimiento, String tipoMembresia) {
        super('a');
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.codSeguridad = codSeguridad;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoMembresia = tipoMembresia;
    }

   /**
     * Devuelve el apellido del @code{Cliente}
     * @return apellido del @code{Cliente}
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece un valor para el apellido del @code{Cliente}
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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

   /**
     * Devuelve el atributo banco
     * @return El nombre del banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Establece el atributo banco
     * @param Banco El nombre del banco
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }
    /**
     * Establece el atributo codSeguridad
     * @return El código de seguridad de la tarjeta
     */
    public String getCodSeguridad() {
        return codSeguridad;
    }
    /**
     * Establece el atributo direccion
     * @return La dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Establece el atributo fechaVencimiento
     * @return La fecha de vencimiento de la tarjeta
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    /**
     * Establece el atributo numTarjeta
     * @return El número de la tarjeta
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }
    /**
     * Establece el atributo tipoMembresia
     * @return El tipo de membresía del cliente
     */
    public String getTipoMembresia() {
        return tipoMembresia;
    }
    
}
