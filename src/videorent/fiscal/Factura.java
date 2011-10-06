package videorent.fiscal;

import java.util.ArrayList;
import videorent.articulo.Articulo;
import videorent.cliente.Asociado;

/**
 * Representa una factura generada por el sistema de VideoRent.
 *
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @version 0.1 - 06.10.2011
 */
public class Factura {
    protected Asociado cliente;
    protected ArrayList<Articulo> articulos;
    protected ArrayList<Double> monto;
    protected Double montoTotal;

    /**
     * Constructor de la clase Factura.
     *
     * @param cliente
     * @param articulos
     * @param monto
     * @param montoTotal
     */
    public Factura(Asociado cliente, ArrayList<Articulo> articulos,
            ArrayList<Double> monto, Double montoTotal) {
        this.cliente = cliente;
        this.articulos = articulos;
        this.monto = monto;
        this.montoTotal = montoTotal;
    }

    /**
     * Devuelve el atributo artículos
     * @return Lista de artículos
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Establece el atributo artículos
     * @param articulos Lista de artículos
     */
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    /**
     * Devuelve el atributo cliente
     * @return El asociado que figura en la factura
     */
    public Asociado getCliente() {
        return cliente;
    }

    /**
     * Establece el atributo cliente
     * @param cliente El asociado que figura en la factura
     */
    public void setCliente(Asociado cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve el atributo monto
     * @return Lista de montos asociados a los artículos
     */
    public ArrayList<Double> getMonto() {
        return monto;
    }

    /**
     * Establece el atributo monto
     * @param monto Lista de montos asociados a los artículos
     */
    public void setMonto(ArrayList<Double> monto) {
        this.monto = monto;
    }

    /**
     * Devuelve el atributo montoTotal
     * @return La suma de todos los montos de la factura
     */
    public Double getMontoTotal() {
        return montoTotal;
    }

    /**
     * Establece el atributo montoTotal
     * @param montoTotal La suma de todos los montos de la factura
     */
    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
}