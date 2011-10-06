package videorent.articulo;

import java.util.ArrayList;

/**
 * Representa las películas de la tienda videoRent
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
     * Constructor de la clase Pelicula
     * establece por defecto el valor del atributo precioVenta en 90.0
     * @param genero El genero de la película
     * @param actores Los actores de la película
     * @param nombre El nombre de la película
     * @param anio El año de creación de la pelicula
     * @param formato El formato de video de la película
     * @param director El director de la película
     * @param escritor El escrito de la película
     * @param secuela  EL nombre de la secuela (si existe)
     */
    public Pelicula(String genero, ArrayList<String> actores, String nombre, int anio, String formato, String director, String escritor, String secuela) {
        super(genero, actores, nombre, anio);
        this.formato = formato;
        this.director = director;
        this.escritor = escritor;
        this.secuela = secuela;
        this.precioVenta = 90.0;
    }
    /**
     * Getter del atributo director
     * @return El director de la película
     */
    public String getDirector() {
        return director;
    }
    /**
     * Setter del atributo director
     * @param director EL director de la película
     */
    public void setDirector(String director) {
        this.director = director;
    }
    /**
     * Getter del atributo escritor
     * @return El escritor de la película
     */
    public String getEscritor() {
        return escritor;
    }
    /**
     * Setter del atributo escritor
     * @param escritor El escritor de la película
     */
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    /**
     * Getter del atributo formato
     * @return El formato de la película
     */
    public String getFormato() {
        return formato;
    }
    /**
     * Setter del atributo formato
     * @param formato El formato de la película
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }
    /**
     * Getter del atributo secuela
     * @return El nombre de la secuela
     */
    public String getSecuela() {
        return secuela;
    }
    /**
     * Setter del atributo secuela
     * @param secuela El nombre de la secuela
     */
    public void setSecuela(String secuela) {
        this.secuela = secuela;
    }
    /**
     * Metodo que sobreescribe el equals de Object
     * Ve si un objeto dado es igual a alguna película
     * @param obj Objeto a comparar
     * @return Devuelve true si el objeto es igual a la película, 
     * false en caso contrario
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
