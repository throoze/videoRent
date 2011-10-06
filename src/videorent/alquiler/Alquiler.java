package videorent.alquiler;

import articulo.Articulo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * Representa un Conjunto de {@code Articulos} que han sido alquilados, en
 * una misma fecha.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 04.10.2011
 */
public abstract class Alquiler {
    /**
     * Fecha en la que se realizó el alquiler.
     */
    private Date fecha;

    /**
     * {@code Map} de {@code Date} a {@code ArrayList<Articulo>}, que almacena una
     * lista de {@code Articulo}, clasificados por la fecha de vencimiento, lo
     * cual permitirá un mejor desempeño en las consultas realizadas sobre este
     * atributo.
     */
    private HashMap<Date,ArrayList<Articulo>> articulos;

    /**
     * Crea un nuevo {@code Alquiler}, vacío, con la fecha del momento en que
     * fue creado.
     */
    public Alquiler() {
        this.fecha = new Date();
    }

    /**
     * Crea un nuevo {@code Alquiler} con fecha '{@code fecha}', y una lista vacía de
     * {@code Articulo}.
     *
     * @param fecha fecha en que se realizó el {@code Alquiler}.
     */
    public Alquiler(Date fecha) {
        this.fecha = fecha;
        this.articulos = new HashMap<Date,ArrayList<Articulo>>();
    }

    /**
     * Construye un nuevo {@code Alquiler} efectuado en fecha {@code fecha} a
     * partir de una lista de {@code Articulo}.
     *
     * @param fecha Fecha en la que se realizó este {@code Alquiler}.
     * @param articulos Lista de artículos alquilados el día {@code fecha}.
     */
    public Alquiler(Date fecha, List<Articulo> articulos) {
        this.fecha = fecha;
        this.articulos = new HashMap<Date,ArrayList<Articulo>>();
        Iterator iterator = articulos.iterator();
        while(iterator.hasNext()) {
            this.adjuntar((Articulo)iterator.next());
        }
    }

    /**
     * Devuelve la fecha en la que fue realizado este {@code Alquiler}
     *
     * @return fecha en la que fue realizado este {@code Alquiler}
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece el valor de la fecha en que fué realizado este {@code Alquiler}
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve una lista que contiene los artículos alquilados en este
     * {@code Alquiler}
     *
     * @return lista de artículos alquilados en este {@code Alquiler}
     */
    public List getArticulos(){
        ArrayList<Articulo>  lista = new ArrayList<Articulo>();
        Set<Date> claves =  this.articulos.keySet();
        Iterator iter = claves.iterator();
        while(iter.hasNext()) {
            lista.addAll((List)iter.next());
        }
        return lista;
    }

    /**
     * Establece el valor de la lista de artículos alquilados en este
     * {@code Alquiler}.
     *
     * @param articulos lista de artículos alquilados en este {@code Alquiler}.
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = new HashMap<Date,ArrayList<Articulo>>();
        Iterator iterator = articulos.iterator();
        while(iterator.hasNext()) {
            this.adjuntar((Articulo)iterator.next());
        }
    }

    /**
     * Añade un {@code Articulo} a este {@code Alquiler}
     *
     * @param articulo {@code Articulo} a añadir.
     * @return {@code true}, en caso de éxito; {@code false} en cualquier otro
     * caso.
     */
    private boolean adjuntar(Articulo articulo) {
        Date vence = this.venceAl(articulo);
        if (this.articulos.get(vence) == null) {
            this.articulos.put(vence, new ArrayList<Articulo>());
        }
        return this.articulos.get(vence).add(articulo);
    }

    /**
     * Añade un {@code Articulo} a este {@code Alquiler}.
     *
     * @param articulo {@code Articulo} a añadir.
     * @return {@code true}, en caso de éxito; {@code false} en cualquier otro
     * caso.
     */
    public boolean agregar(Articulo articulo) {
        this.adjuntar(articulo);
        return true;
    }

    /**
     * Devuelve una lista de {@code Articulo} alquilados en este
     * {@code Alquiler}, cuyo alquiler vence en la fecha {@code fecha}.
     *
     * @param fecha fecha de vencimiento del alquiler de los {@code Articulo}
     * devueltos.
     * @return lista de {@code Articulo} alquilados en este {@code Alquiler},
     * cuyo alquiler vence en la fecha {@code fecha}.
     */
    public List<Articulo> articulosPorVencimiento(Date fecha){
        return this.articulos.get(fecha);
    }

    /**
     * Devuelve {@code true} si el articulo {@code articulo} está contenido en
     * en este {@code Alquiler}, y {@code false} en caso contrario.
     *
     * @param articulo Articulo a comparar con el contenido de este alquiler.
     * @return {@code true} si el articulo {@code articulo} está contenido en
     * en este {@code Alquiler}, y {@code false} en caso contrario.
     */
    public boolean contiene(Articulo articulo) {
        Set<Date> claves = this.articulos.keySet();
        Iterator itr = claves.iterator();
        while(itr.hasNext()){
            List<Articulo> list = (List) itr.next();
            Iterator iter = list.iterator();
            while(iter.hasNext()) {
                Articulo item = (Articulo) iter.next();
                if ((articulo==null ? item==null : articulo.equals(item))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Compara un {@code Alquiler} con este, bajo la relación de igualdad.
     *
     * @param obj {@code Alquiler} a Ser comparado
     * @return true si este {@code Alquiler} es igual a {@code obj}; false en
     * caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquiler other = (Alquiler) obj;
        if (this.fecha != other.fecha && (this.fecha == null || !this.fecha.equals(other.fecha))) {
            return false;
        }
        if (this.articulos != other.articulos && (this.articulos == null || !this.articulos.equals(other.articulos))) {
            return false;
        }
        return true;
    }

    /**
     * Retorna la fecha de vencimiento del este {@code Alquiler} del articulo
     * {@code articulo}.
     *
     * @param articulo {@code Articulo} cuya fecha de vencimiento se desea
     * calcular.
     * @return la fecha de vencimiento del articulo {@code articulo}
     */
    private Date venceAl(Articulo articulo){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.fecha);
        cal.add(Calendar.DAY_OF_YEAR, articulo.getTiempoPrestamo());
        return cal.getTime();
    }
}