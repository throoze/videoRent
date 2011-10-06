package videorent.articulo;

/**
 * Representa los artículos de tipo interactivos de la tienda VideoRent
 *
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @version 0.1 - 06.10.2011
 */
public abstract class ArticuloInteractivo extends Articulo {
    protected String plataforma;

    /**
     * Constructor de la clase ArticuloInteractivo
     *
     * @param nombre EL nombre del artículo de tipo interactivo
     * @param anio EL año de creación del artículo de tipo interactivo
     * @param plataforma La plataforma en la que corre el artículo interactivo
     */
    public ArticuloInteractivo(String nombre, int anio, String plataforma) {
        super(nombre, anio);
        this.plataforma = plataforma;
    }

    /**
     * Devuelve el atributo plataforma
     * @return EL nombre de la plataforma donde corre el articulo interactivo
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Establece el atributo plataforma
     * @param plataforma El nombre de la plataforma  donde corre el articulo
     * interactivo
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}