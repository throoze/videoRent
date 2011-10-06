package articulo;

/**
 * Representa los juegos de tipo educativo de la tienda videoRent
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821 
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087 
 */
public class JuegoEducativo extends ArticuloInteractivo{
    protected String habilidad;
    /**
     * Constructor de la clase JuegoEducativo
     * Inicializa directamente los atributos tiempoPrestamo, montoMulta, 
     * precioAlquiler, y precioVenta
     * @param nombre EL nombre del juego
     * @param anio EL año de creación del juego
     * @param plataforma La plataforma donde corre el juego
     * @param habilidad Habilidad desarrollada con el juego
     */
    public JuegoEducativo(String nombre, int anio, String plataforma, String habilidad) {
        super(nombre, anio, plataforma);
        this.habilidad = habilidad;
        this.tiempoPrestamo = 5;
        this.montoMulta = 1.0;
        this.precioAlquiler = 7.0;
        this.precioVenta = 50.0;
    }
    /**
     * Getter del atributo habilidad
     * @return Habilidad desarrollada con el juego
     */
    public String getHabilidad() {
        return habilidad;
    }
    /**
     * Setter del atributo habilidad
     * @param habilidad Habilidad desarrollada con el juego
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    /**
     * Metodo que sobreescribe al de articulo
     * Calcula la multa en base a los días de atrazo en la devolución
     * @param dias Días de atrazo en la devolución de la serie
     * @return Monto a multar
     */
    @Override
    public Double getMulta(int dias) {
        double x = getMontoMulta()*dias;
        return x;
    }
    
}
