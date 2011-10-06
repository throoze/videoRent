package videorent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import videorent.acciones.AbandonarTienda;
import videorent.acciones.Accion;
import videorent.acciones.ActualizarTarjeta;
import videorent.acciones.Asociarse;
import videorent.acciones.DevolverArticulo;
import videorent.acciones.LlevarParaAlquiler;
import videorent.acciones.LlevarParaCompra;
import videorent.acciones.Pagar;
import videorent.acciones.PedirRecogerArticulo;
import videorent.articulo.Articulo;
import videorent.articulo.JuegoEducativo;
import videorent.articulo.JuegoRecreativo;
import videorent.articulo.Pelicula;
import videorent.articulo.TemporadaSerie;
import videorent.cliente.Asociado;
import videorent.fiscal.Factura;

/**
 * Sistema de venta y alquiler de artículos audiovisuales e interactivos de la
 * tienda VideoRent. Proyecto 0 del la materia Laboratorio de Lenguajes de
 * Programación, Septiembre-Diciembre 2011.
 * Profesora: Gabriela Montoya
 * Sinópsis:
 *      compilado:
 *          javac VideoRent.java
 *
 * @author <a href="mailto:victor.dpo@gmail.com">Victor De Ponte</a> 05-38087
 * @author <a href="mailto:julesallblack@gmail.com">Julio López</a> 06-39821
 * @author <a href="http://www.usb.ve/">Universidad Simón Bolívar</a>
 * @version 1.0 - 04.10.2011
 */
public class VideoRent {

    // Entrada / Salida
    //        Entrada
    private BufferedReader asociadosIn;
    private BufferedReader articulosIn;
    private BufferedReader accionesIn;
    //        Salida
    private PrintStream accionesOut;
    private PrintStream facturasOut;
    private PrintStream stockOut;
    private PrintStream asociadosOut;
    private PrintStream prestamoOut;
    //    Nombres por defecto
    private String defSalida1 = "AccionesEmpleadosDespues";
    private String defSalida2 = "Facturas";
    private String defSalida3 = "ArticulosExistenciaDespues";
    private String defSalida4 = "ClientesAsociadosDespues";
    private String defSalida5 = "ArticulosPrestamo";

    // Parámetros de lectura
    private int numDias;
    private int numAcClientes;
    private int numArticulos;
    private Date inicio;

    // Almacenamiento
    private HashMap<Articulo,Integer> stock;
    private HashMap<Articulo,Integer> prestamo;
    private List<Asociado> asociados;

    // Procesamiento
    private Queue<Accion> accClientes;
    private Queue<Accion> accEmpleados;
    private List<Factura> facturas;

   public VideoRent(String entrada1, String entrada2, String entrada3,
           String salida1, String salida2, String salida3,
           String salida4, String salida5 ) {

        BufferedReader buffEntrada1 = null;
        BufferedReader buffEntrada2 = null;
        BufferedReader buffEntrada3 = null;
        PrintStream strmSalida1 = null;
        PrintStream strmSalida2 = null;
        PrintStream strmSalida3 = null;
        PrintStream strmSalida4 = null;
        PrintStream strmSalida5 = null;

        try {
            buffEntrada1 = new BufferedReader(new FileReader(entrada1));
            buffEntrada2 = new BufferedReader(new FileReader(entrada2));
            buffEntrada3 = new BufferedReader(new FileReader(entrada3));
            strmSalida1 = new PrintStream(salida1);
            strmSalida2 = new PrintStream(salida2);
            strmSalida3 = new PrintStream(salida3);
            strmSalida4 = new PrintStream(salida4);
            strmSalida5 = new PrintStream(salida5);
        } catch (IOException e) {
            System.err.println("Error al crear los archivos:\n\t"+
                    salida1 + "\n\t" +
                    salida2 + "\n\t" +
                    salida3 + "\n\t" +
                    salida4 + "\n\t" +
                    salida5 + "\n\t");
            System.err.println(e.getMessage());
            //System.err.println(e.getCause().toString());
        }

        this.asociadosIn = buffEntrada1;
        this.articulosIn = buffEntrada2;
        this.accionesIn = buffEntrada3;

        this.accionesOut = strmSalida1;
        this.facturasOut = strmSalida2;
        this.stockOut = strmSalida3;
        this.asociadosOut = strmSalida4;
        this.prestamoOut = strmSalida5;

        this.init();
    }

    public VideoRent(String entrada1, String entrada2, String entrada3) {

        BufferedReader buffEntrada1 = null;
        BufferedReader buffEntrada2 = null;
        BufferedReader buffEntrada3 = null;
        PrintStream strmSalida1 = null;
        PrintStream strmSalida2 = null;
        PrintStream strmSalida3 = null;
        PrintStream strmSalida4 = null;
        PrintStream strmSalida5 = null;

        try {
            buffEntrada1 = new BufferedReader(new FileReader(entrada1));
            buffEntrada2 = new BufferedReader(new FileReader(entrada2));
            buffEntrada3 = new BufferedReader(new FileReader(entrada3));
            strmSalida1 = new PrintStream(this.defSalida1);
            strmSalida2 = new PrintStream(this.defSalida2);
            strmSalida3 = new PrintStream(this.defSalida3);
            strmSalida4 = new PrintStream(this.defSalida4);
            strmSalida5 = new PrintStream(this.defSalida5);
        } catch (IOException e) {
            System.err.println("Error al crear los archivos:\n\t"+
                    this.defSalida1 + "\n\t" +
                    this.defSalida2 + "\n\t" +
                    this.defSalida3 + "\n\t" +
                    this.defSalida4 + "\n\t" +
                    this.defSalida5 + "\n\t");
            System.err.println(e.getMessage());
            //System.err.println(e.getCause().toString());
        }

        this.asociadosIn = buffEntrada1;
        this.articulosIn = buffEntrada2;
        this.accionesIn = buffEntrada3;

        this.accionesOut = strmSalida1;
        this.facturasOut = strmSalida2;
        this.stockOut = strmSalida3;
        this.asociadosOut = strmSalida4;
        this.prestamoOut = strmSalida5;

        this.init();
    }

    private void init(){
        // Almacenamiento
        this.stock = new HashMap<Articulo,Integer>();
        this.prestamo = new HashMap<Articulo,Integer>();
        this.asociados = new ArrayList<Asociado>();

        // Procesamiento
        this.accClientes = new LinkedList<Accion>();
        this.accEmpleados = new LinkedList<Accion>();
        this.facturas = new ArrayList<Factura>();
    }

    private Asociado crearAsociado(String linea) {
        String[] tokens = linea.split(" & ");
        return null;
    }

    private Accion crearAccionCliente(String linea) {
        String[] tokens = linea.split(" & ");
        String tipoOp = tokens[0];
        Accion t = null;

        if (tipoOp.equals("a")) {
            t = new Asociarse(tokens[1],tokens[2],
                            tokens[3],tokens[4],tokens[5],tokens[6],
                            tokens[7],tokens[8],tokens[9],tokens[10]);
        } else if (tipoOp.equals("t")) {
            t = new ActualizarTarjeta(tokens[1],tokens[2],tokens[3],
                            tokens[4],tokens[5]);
        } else if (tipoOp.equals("c")) {
            t = new LlevarParaCompra(tokens[1],tokens[2]);
        } else if (tipoOp.equals("r")) {
            t = new LlevarParaAlquiler(tokens[1],tokens[2]);
        } else if (tipoOp.equals("p")) {
            t = new Pagar(tokens[1], Double.parseDouble(tokens[2]));
        } else if(tipoOp.equals("b")){
            t = new AbandonarTienda(tokens[1]);
        } else if(tipoOp.equals("d")){
            t = new DevolverArticulo(tokens[1],tokens[2]);
        } else if(tipoOp.equals("e")){
            t = new PedirRecogerArticulo(tokens[1],tokens[2]);
        } return t;
    }

    private Accion crearAccionEmpleado(String linea) {
        String[] tokens = linea.split(" & ");
        String tipoOp = tokens[0];
        Accion t = null;

        if(tipoOp.equals("r")){
            t = new
        } else if(tipoOp.equals("c")){
            t = new
        } else if(tipoOp.equals("t")){
            t = new
        } else if(tipoOp.equals("b")){
            t = new
        } else if(tipoOp.equals("l")){
            t = new
        } else if(tipoOp.equals("p")){
            t = new
        } else if(tipoOp.equals("i")){
            t = new
        }
        return t;
    }
    
     private Articulo crearArticulo(String linea) throws IOException {
        String[] tokens = linea.split(" & ");
        String tipoOp = tokens[0];
        Pattern p = Pattern.compile("[PSRE]d{4}");
        Matcher m = p.matcher(tokens[0]);
        Articulo a = null;
        if (m.matches()){
            // saco la primera letra y veo a ke constructor llamo (pelicula, serie, etc)
            char temp = tipoOp.charAt(0);
            if(temp=='P'){
                a = new Pelicula(tokens[4], tokens[8], tokens[2], Integer.parseInt(tokens[3]), tokens[5], tokens[6], tokens[7], tokens[9]);                
            } else if(temp=='S'){
                a = new TemporadaSerie(tokens[6], tokens[2], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[3]), tokens[5], Integer.parseInt(tokens[7]));                                        
            } else if(temp=='R'){
                a = new JuegoRecreativo(tokens[2], Integer.parseInt(tokens[6]), tokens[5], tokens[3], tokens[4]);                                        
            } else if(temp=='E'){
                a = new JuegoEducativo(tokens[2], Integer.parseInt(tokens[5]), tokens[4], tokens[3]);
            }
            
            this.stock.put(a, tokens[1]);
        }
        else 
            throw new IOException("Error en el archivo de entrada de artículos");
        
        return a;
    }
    
    public void leer() {
        this.leerAsociados();
        this.leerArticulos();
        this.leerAcciones();
    }

    private void leerAsociados() {
        String linea = "";
        try {
            while ((linea = this.asociadosIn.readLine()) != null) {
                Asociado asociado = crearAsociado(linea);
                this.asociados.add(asociado);
            }
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }

    private void leerArticulos() {
        String linea = "";
        int contador = 0;
        try {
            linea = this.articulosIn.readLine();
            contador = Integer.parseInt(linea);
            for(int u=0; u<contador; u++){
                linea = this.articulosIn.readLine();
                Articulo articulo = crearArticulo(linea);
            }
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }

    private void leerAcciones() {
        String linea = "";
        try {
            while ((linea = this.accionesIn.readLine()) != null) {
                Accion accion = crearAccionCliente(linea);
                this.accClientes.add(accion);
            }
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }

    /**
     * Método Main.
     * @param args argumentos de entrada de la linea de comandos.
     */
    public static void main(String[] args) {
        VideoRent videoRent = null;
        if (args.length == 3) {
            videoRent = new VideoRent(args[0], args[1], args[2]);
        } else if (args.length == 8) {
           videoRent = new VideoRent(args[0], args[1], args[2], args[3], args[4],
                   args[5], args[6], args[7]);
        } else {
           System.err.println("Sintaxis:\n\t VideoRent <asociadosAntes> " +
                   "<articulosAntes> <accionesClientes>\n\t  VideoRent " +
                   "<asociadosAntes> <articulosAntes> <accionesClientes> " +
                   "<accionesEmpleados> <facturas> <articulosDespues> " +
                   "<asociadosDespues> <articulosPrestamo>");
           System.exit(-1);
        }

        videoRent.leer();
        videoRent.procesar();
        videoRent.escribir();
    }

}