package videorent.fiscal;

import java.util.ArrayList;
import videorent.articulo.Articulo;
import videorent.cliente.Asociado;

/**
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @author <a href="julesallblack@gmail.com">Julio López</a> 06-39821 
 * @author <a href="victor.dpo@gmail.com">Victor De Ponte</a> 05-38087 
 */
public class Factura {
    protected Asociado cliente;
    protected ArrayList<Articulo> articulos;
    protected ArrayList<Double> monto;
    protected Double montoTotal;
    
    /**
     * Constructor de la clase Factura
     * @param cliente
     * @param articulos
     * @param monto
     * @param montoTotal 
     */
    public Factura(Asociado cliente, ArrayList<Articulo> articulos, ArrayList<Double> monto, Double montoTotal) {
        this.cliente = cliente;
        this.articulos = articulos;
        this.monto = monto;
        this.montoTotal = montoTotal;
    }
    /**
     * Getter del atributo articulos
     * @return Lista de artículos
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    /**
     * Setter del atributo artículos
     * @param articulos Lista de artículos
     */
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    /**
     * Getter del atributo cliente
     * @return El asociado que figura en la factura
     */
    public Asociado getCliente() {
        return cliente;
    }
    /**
     * Setter del atributo cliente
     * @param cliente El asociado que figura en la factura
     */
    public void setCliente(Asociado cliente) {
        this.cliente = cliente;
    }
    /**
     * Getter del atributo monto
     * @return Lista de montos asociados a los artículos
     */
    public ArrayList<Double> getMonto() {
        return monto;
    }
    /**
     * Setter del atributo monto
     * @param monto Lista de montos asociados a los artículos
     */
    public void setMonto(ArrayList<Double> monto) {
        this.monto = monto;
    }
    /**
     * Getter del atributo montoTotal
     * @return La suma de todos los montos de la factura
     */
    public Double getMontoTotal() {
        return montoTotal;
    }
    /**
     * Setter del atributo montoTotal
     * @param montoTotal La suma de todos los montos de la factura
     */
    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
}
