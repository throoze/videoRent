package videorent.articulo;

/**
 * Representa los juegos de tipo recreativo de la tienda videoRent.
 *
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @version 0.1 06.10.2011
 */
public class JuegoRecreativo extends ArticuloInteractivo {
    protected String genero;
    protected String desarrollador;

    /**
     * Constructor de la clase JuegoRecreativo
     * Inicializa directamente los atributos tiempoPrestamo, montoMulta,
     * precioAlquiler, y precioVenta
     *
     * @param nombre
     * @param anio
     * @param plataforma
     * @param genero
     * @param desarrollador
     */
    public JuegoRecreativo(String nombre, int anio, String plataforma,
            String genero, String desarrollador, String codigo) {
        super(nombre, anio, plataforma, codigo);
        this.genero = genero;
        this.desarrollador = desarrollador;
        this.tiempoPrestamo = 2;
        this.montoMulta = 10.0;
        this.precioAlquiler = 12.0;
        this.precioVenta = 250.0;
    }

    /**
     * Devuelve el atributo desarrollador
     * @return El nombre del desarrollador
     */
    public String getDesarrollador() {
        return desarrollador;
    }

    /**
     * Establece el atributo desarrollador
     * @param desarrollador El nombre del desarrollador
     */
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    /**
     * Devuelve el atributo genero
     * @return El género del juego
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el atributo genero
     * @param genero El género del juego
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public Double getMulta(int dias) {
        double x = getMontoMulta()*dias;
        return x;
    }
}