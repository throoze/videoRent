package videorent.articulo;

 /**
 * Representa los artículos que comercia la tienda
 * VideoRent, hereda de Articulo
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 */
public abstract class Articulo {
    protected String nombre;
    protected int anio;
    public int tiempoPrestamo;
    public double montoMulta;
    public double precioAlquiler;
    public double precioVenta;

    /**
     * Constructor de la clase
     * @param nombre El nombre del artículo
     * @param anio El año de creación del artículo
     */
    public Articulo(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    /**
     * Getter del atributo anio
     * @return El año de creación
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Setter del atributo anio
     * @param anio El año de creación
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Getter del atributo montoMulta
     * @return monto de la multa por vencimiento
     * prestamo
     */
    public double getMontoMulta() {
        return montoMulta;
    }
    /**
     * Setter del atributo montoMulta
     * @param montoMulta EL monto a multar por vencimiento
     * de prestamo
     */
    public void setMontoMulta(double montoMulta) {
        this.montoMulta = montoMulta;
    }
    /**
     * Getter del atributo nombre
     * @return El nombre del atributo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter del atributo nobmre
     * @param nombre EL nombre del atributo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter del atributo precioAlquiler
     * @return EL monto a pagar por alquiler
     */
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    /**
     * Setter del atributo precioAlquiler
     * @param precioAlquiler EL monto a pagar por alquiler
     */
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    /**
     * Getter del atributo precioVenta
     * @return EL monto a pagar por venta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }
    /**
     * Setter del atributo precioVenta
     * @param precioVenta EL monto a pagar por venta
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    /**
     * Getter del atributo tiempoPrestamo
     * @return EL tiempo de prestamo
     */
    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }
    /**
     * Setter del atributo tiempoPrestamo
     * @param tiempoPrestamo EL tiempo de prestamo
     */
    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }
    /**
     * Metodo abstracto para obtener la multa asociada a un
     * articulo no devuelto a tiempo
     * @param dias
     * @return
     */
    public abstract Double getMulta(int dias);

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.tiempoPrestamo != other.tiempoPrestamo) {
            return false;
        }
        if (Double.doubleToLongBits(this.montoMulta) != Double.doubleToLongBits(other.montoMulta)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioAlquiler) != Double.doubleToLongBits(other.precioAlquiler)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioVenta) != Double.doubleToLongBits(other.precioVenta)) {
            return false;
        }
        return true;
    }
}
