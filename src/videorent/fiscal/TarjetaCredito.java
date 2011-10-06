package videorent.fiscal;

import cliente.Cliente;
import java.util.Date;

/**
 * Representa la tarjeta de credito de cada cliente de la tienda videoRent
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
    public TarjetaCredito(long numero, String Banco, int codSeguridad, Date vencimiento, Cliente dueño) {
        this.numero = numero;
        this.Banco = Banco;
        this.codSeguridad = codSeguridad;
        this.vencimiento = vencimiento;
        this.dueño = dueño;
    }
    /**
     * Getter del atributo banco
     * @return El nombre del banco
     */
    public String getBanco() {
        return Banco;
    }
    /**
     * Setter del atributo banco
     * @param Banco El nombre del banco
     */
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }
    /**
     * Getter del atributo codSeguridad
     * @return El código de seguridad
     */
    public int getCodSeguridad() {
        return codSeguridad;
    }
    /**
     * Setter del atributo codSeguridad
     * @param codSeguridad El código de seguridad
     */
    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }
    /**
     * Getter del atributo numero
     * @return El número de la tarjeta
     */
    public long getNumero() {
        return numero;
    }
    /**
     * Setter del atributo numero
     * @param numero El número de la tarjeta
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }
    /**
     * Getter del atributo vencimiento
     * @return La fecha de vencimiento
     */
    public Date getVencimiento() {
        return vencimiento;
    }
    /**
     * Setter del atributo vencimiento
     * @param vencimiento La fecha de vencimiento
     */
    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    /**
     * Getter del atributo dueño
     * @return El cliente dueño de la tarjeta
     */
    public Cliente getDueño() {
        return dueño;
    }
    /**
     * Setter del atributo dueño
     * @param dueño El cliente dueño de la tarjeta
     */
    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

}
