package videorent.fiscal;

import java.util.Date;
import videorent.cliente.Cliente;

/**
 * Representa la tarjeta de crédito de cada cliente de la tienda videoRent.
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 04.10.2011
 */
public class TarjetaCredito {
    private long numero;
    private String Banco;
    private int codSeguridad;
    private Date vencimiento;
    private Cliente dueño;

    /**
     * Constructor de la clase TarjetaCredito
     * @param numero El número de la tarjeta
     * @param Banco El banco de la tarjeta
     * @param codSeguridad El código de seguridad
     * @param vencimiento La fecha de vencimiento
     * @param dueño El dueño de la tarjeta
     */
    public TarjetaCredito(long numero, String Banco, int codSeguridad,
            Date vencimiento, Cliente dueño) {
        this.numero = numero;
        this.Banco = Banco;
        this.codSeguridad = codSeguridad;
        this.vencimiento = vencimiento;
        this.dueño = dueño;
    }

    /**
     * Devuelve el atributo banco
     * @return El nombre del banco
     */
    public String getBanco() {
        return Banco;
    }

    /**
     * Establece el atributo banco
     * @param Banco El nombre del banco
     */
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    /**
     * Devuelve el atributo codSeguridad
     * @return El código de seguridad
     */
    public int getCodSeguridad() {
        return codSeguridad;
    }

    /**
     * Establece el atributo codSeguridad
     * @param codSeguridad El código de seguridad
     */
    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    /**
     * Devuelve el atributo numero
     * @return El número de la tarjeta
     */
    public long getNumero() {
        return numero;
    }

    /**
     * Establece el atributo numero
     * @param numero El número de la tarjeta
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el atributo vencimiento
     * @return La fecha de vencimiento
     */
    public Date getVencimiento() {
        return vencimiento;
    }

    /**
     * Establece el atributo vencimiento
     * @param vencimiento La fecha de vencimiento
     */
    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * Devuelve el atributo dueño
     * @return El cliente dueño de la tarjeta
     */
    public Cliente getDueño() {
        return dueño;
    }

    /**
     * Establece el atributo dueño
     * @param dueño El cliente dueño de la tarjeta
     */
    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }
}
