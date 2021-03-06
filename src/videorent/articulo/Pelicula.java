package videorent.articulo;

import java.util.ArrayList;

/**
 * Representa las películas de la tienda videoRent
 *
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 */
public class Pelicula extends ArticuloAudiovisual{
    protected String formato;
    protected String director;
    protected String escritor;
    protected String secuela;

    /**
     * Constructor de la clase {@code Pelicula}
     * establece por defecto el valor del atributo precioVenta en 90.0
     *
     * @param genero El genero de la película
     * @param actores Los actores de la película
     * @param nombre El nombre de la película
     * @param anio El año de creación de la película
     * @param formato El formato de video de la película
     * @param director El director de la película
     * @param escritor El escrito de la película
     * @param secuela  EL nombre de la secuela (si existe)
     */
    public Pelicula(String genero, String actores, String nombre, int anio, String formato, String director, String escritor, String secuela) {
        super(genero, actores, nombre, anio, "CAMBIAR ESTO");
        this.formato = formato;
        this.director = director;
        this.escritor = escritor;
        this.secuela = secuela;
        this.precioVenta = 90.0;
    }
    /**
     * Devuelve el atributo director
     * @return El director de la película
     */
    public String getDirector() {
        return director;
    }
    /**
     * Establece el atributo director
     * @param director EL director de la película
     */
    public void setDirector(String director) {
        this.director = director;
    }
    /**
     * Devuelve el atributo escritor
     * @return El escritor de la película
     */
    public String getEscritor() {
        return escritor;
    }
    /**
     * Establece el atributo escritor
     * @param escritor El escritor de la película
     */
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    /**
     * Devuelve el atributo formato
     * @return El formato de la película
     */
    public String getFormato() {
        return formato;
    }
    /**
     * Establece el atributo formato
     * @param formato El formato de la película
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }
    /**
     * Devuelve el atributo secuela
     * @return El nombre de la secuela
     */
    public String getSecuela() {
        return secuela;
    }
    /**
     * Establece el atributo secuela
     * @param secuela El nombre de la secuela
     */
    public void setSecuela(String secuela) {
        this.secuela = secuela;
    }
    /**
     * Método que sobreescribe el {@code equals} de la clase {@code Object}
     * Prueba si un objeto dado es igual a alguna película.
     *
     * @param obj Objeto a comparar
     * @return {@code true} si el objeto es igual a la película, {@code false}
     * en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if ((this.formato == null) ? (other.formato != null) : !this.formato.equals(other.formato)) {
            return false;
        }
        if ((this.director == null) ? (other.director != null) : !this.director.equals(other.director)) {
            return false;
        }
        if ((this.escritor == null) ? (other.escritor != null) : !this.escritor.equals(other.escritor)) {
            return false;
        }
        if ((this.secuela == null) ? (other.secuela != null) : !this.secuela.equals(other.secuela)) {
            return false;
        }
        return true && super.equals(obj);
    }
}