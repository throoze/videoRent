package articulo;

import java.util.ArrayList;

 /**
 * Representa los artículos de tipo audio-visual que comercia la tienda 
 * VideoRent, hereda de Articulo
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821 
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087 
 */
public class ArticuloAudiovisual extends Articulo {
    protected String genero; 
    protected ArrayList<String> actores;
    
    /**
     * Constructor de la clase ArticuloAudiovisual
     * @param genero El género del artículo audio-visual
     * @param actores Conjunto de actores de la pelicula o serie
     * @param nombre El nombre del articulo audio-visual
     * @param anio  El año de creación
     */
    public ArticuloAudiovisual(String genero, ArrayList<String> actores, String nombre, int anio) {
        super(nombre, anio);
        this.genero = genero;
        this.actores = actores;
        this.tiempoPrestamo = 3;
        this.montoMulta = 5.0;
        this.precioAlquiler = 10.0;
    }
    
    /**
     * Método que implementa el método abstracto de articulo
     * Calcula la multa a poner basado en los días de retrazo
     * @param dias Los días de retrazo de devolución del artículo
     * @return Monto a multar
     */
    @Override
    public Double getMulta(int dias) {
        //10bsf+5bsf*diasextra
        double x = getMontoMulta()*dias;
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArticuloAudiovisual other = (ArticuloAudiovisual) obj;
        if ((this.genero == null) ? (other.genero != null) : !this.genero.equals(other.genero)) {
            return false;
        }
        if (this.actores != other.actores && (this.actores == null || !this.actores.equals(other.actores))) {
            return false;
        }
        return true && super.equals(obj);
    }

}
