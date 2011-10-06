package articulo;

import java.util.ArrayList;

/**
 * Representa las temporadas de series de la tienda videoRent
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821 
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087 
 */
public class TemporadaSerie extends ArticuloAudiovisual{
    protected int numTemporada;
    protected String creador;
    protected int cantEpisodios;
    
    /**
     * Constructor de la clase TemporadaSerie
     * @param genero El género de la serie
     * @param actores Los actores de la serie
     * @param nombre El nombre de la serie
     * @param anio El año de creción de la serie
     * @param numTemporada La temporada de la serie
     * @param creador El creador de la serie
     * @param cantEpisodios El número de episodios de la serie
     */
    public TemporadaSerie(String genero, ArrayList<String> actores, String nombre, int anio, int numTemporada, String creador, int cantEpisodios) {
        super(genero, actores, nombre, anio);
        this.numTemporada = numTemporada;
        this.creador = creador;
        this.cantEpisodios = cantEpisodios;
        this.precioVenta = 100.0;
    }
    /**
     * Getter del atributo cantEpisodios
     * @return El número de episodios
     */
    public int getCantEpisodios() {
        return cantEpisodios;
    }
    /**
     * Setter del atributo cantEpisodios
     * @param cantEpisodios  El número de episodios
     */
    public void setCantEpisodios(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
    }
    /**
     * Getter del atributo creador
     * @return El creador de la serie
     */
    public String getCreador() {
        return creador;
    }
    /**
     * Setter del atributo creador
     * @param creador El creador de la serie  
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }
    /**
     * Getter del atributo numTemporada
     * @return El número de la temporada de la serie
     */
    public int getNumTemporada() {
        return numTemporada;
    }
    /**
     * Setter del atributo numTemporada
     * @param numTemporada El número de temporada de la serie
     */
    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }
    
}
