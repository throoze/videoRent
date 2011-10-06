package videorent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import videorent.acciones.AbandonarTienda;
import videorent.acciones.Accion;
import videorent.acciones.ActualizarTarjeta;
import videorent.acciones.Asociarse;
import videorent.acciones.BuscarArticulo;
import videorent.acciones.CambiarEstado;
import videorent.acciones.CambiarTarjeta;
import videorent.acciones.CobrarPerdido;
import videorent.acciones.DevolverArticulo;
import videorent.acciones.Facturar;
import videorent.acciones.InformarError;
import videorent.acciones.LlevarParaAlquiler;
import videorent.acciones.LlevarParaCompra;
import videorent.acciones.Pagar;
import videorent.acciones.PedirRecogerArticulo;
import videorent.acciones.RecordarDevolucion;
import videorent.acciones.RegistrarAsociado;
import videorent.articulo.Articulo;
import videorent.articulo.JuegoEducativo;
import videorent.articulo.JuegoRecreativo;
import videorent.articulo.Pelicula;
import videorent.articulo.TemporadaSerie;
import videorent.cliente.Asociado;
import videorent.fiscal.Factura;
import videorent.fiscal.TarjetaCredito;

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
    private String strEntrada1 = "";
    private String strEntrada2 = "";
    private String strEntrada3 = "";
    private String defSalida1 = "AccionesEmpleadosDespues";
    private String defSalida2 = "Facturas";
    private String defSalida3 = "ArticulosExistenciaDespues";
    private String defSalida4 = "ClientesAsociadosDespues";
    private String defSalida5 = "ArticulosPrestamo";

    // Parámetros de lectura
    private int numDias;
    private int numAcClientes;
    private int numArticulos;
    private int proxIdCliente;
    private Date inicio;

    // Almacenamiento
    private HashMap<Articulo,Integer> stock;
    private HashMap<Articulo,Integer> prestamo;
    private List<Asociado> asociados;

    // Procesamiento
    private ArrayList<Accion> accClientes;
    private ArrayList<Accion> accEmpleados;
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
        this.strEntrada1 = entrada1;
        this.strEntrada2 = entrada2;
        this.strEntrada3 = entrada3;
        this.defSalida1 = salida1;
        this.defSalida2 = salida2;
        this.defSalida3 = salida3;
        this.defSalida4 = salida4;
        this.defSalida5 = salida5;

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
        this.strEntrada1 = entrada1;
        this.strEntrada2 = entrada2;
        this.strEntrada3 = entrada3;

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
        this.accClientes = new ArrayList<Accion>();
        this.accEmpleados = new ArrayList<Accion>();
        this.facturas = new ArrayList<Factura>();
    }

    private Asociado leerAsociado(String linea, int numLinea) throws IOException
    {
        String[] tokens = linea.split(" & ");
        if (tokens.length != 11) {
                    throw new IOException("VideoRent: Mal formato en el "
                            + "archivo de entrada <"+this.strEntrada1+">:"
                            + "linea " + numLinea + ".\n"
                            + "Se esperaban once elementos separados por '&'."
                            + "\n\nEncontrado:\n\t\n"
                            + "'" + linea + "'");
        } else {
            Pattern pattern = Pattern.compile("^[BP]d{4}$");///////////////aca ojo, yo pienso ke es
            ///////////////////////////////// ("[BP]d{4}$")////////////////
            Matcher matcher = pattern.matcher(tokens[0]);
            if (matcher.matches()) {
                if (!(tokens[1].equals("activo") || tokens[1].equals("suspendido"))) {
                    throw new IOException("VideoRent: Mal formato en el "
                            + "archivo de entrada <"+this.strEntrada1+">:"
                            + "linea " + numLinea + ".\n"
                            + "Se esperaba estado 'activo' o 'suspendido'."
                            + "\n\nEncontrado:\n\t\n"
                            + "'" + tokens[1] + "'");
                }
                String[] strFecha = tokens[10].split("/");
                TarjetaCredito tarjeta = new TarjetaCredito(
                        Long.parseLong(tokens[7]), tokens[8],
                        Integer.parseInt(tokens[9]), new Date(
                                Integer.parseInt(strFecha[1]),
                                Integer.parseInt(strFecha[0]),1),
                        null);
                Asociado resp = new Asociado(tokens[0], tokens[0].charAt(0) ,
                        tokens[1], String.valueOf(Integer.parseInt(tokens[2])),
                        tokens[3], tokens[4],
                        String.valueOf(Integer.parseInt(tokens[5])),tokens[6]);
                resp.setTarjeta(tarjeta);
                tarjeta.setDuenio(resp);
                return resp;
            } else {
                throw new IOException("VideoRent: Mal formato en el código del"
                        + "asociado, en la linea "+ numLinea + ".\n\t"
                        + "Se esperaba una letra, 'B' o 'P', seguida de cuatro"
                        + "dígitos.\n\tEncontrado: " +
                        tokens[0]);
            }
        }
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
            t = new RegistrarAsociado(tokens[1]);
        } else if(tipoOp.equals("c")){
            t = new CambiarEstado(tokens[1], tokens[2]);
        } else if(tipoOp.equals("t")){
            t = new CambiarTarjeta(tokens[1]);
        } else if(tipoOp.equals("f")){
            t = new Facturar(tokens[1], Double.parseDouble(tokens[2]));
        } else if(tipoOp.equals("b")){
            t = new BuscarArticulo(tokens[1], tokens[2]);
        } else if(tipoOp.equals("l")){
            t = new RecordarDevolucion(tokens[1]);
        } else if(tipoOp.equals("p")){
            t = new CobrarPerdido(tokens[1], tokens[2]);
        } else if(tipoOp.equals("i")){
            t = new InformarError(tokens[1], Integer.parseInt(tokens[2]));
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
            this.stock.put(a, Integer.parseInt(tokens[1]));
        }
        else
            throw new IOException("Error en el archivo de entrada de artículos");

        return a;
    }

    public void leer() throws IOException {
        this.leerAsociados();
        this.leerArticulos();
        this.leerAcciones();
    }

    private void leerAsociados() throws IOException {
        String linea = "";
        int n = 0;
        try {
            if ((linea = this.asociadosIn.readLine()) != null) {
                String[] tokens = linea.split(" ");
                if (tokens.length != 2) {
                    throw new IOException("VideoRent: Mal formato en el "
                            + "archivo de entrada <"+this.strEntrada1+">:"
                            + "linea 1. "
                            + "Se esperaban dos elementos.\n\nEncontrado:\n\t"
                            + "'" + linea + "'");
                }
                this.proxIdCliente = Integer.parseInt(tokens[1]);
                n = Integer.parseInt(tokens[0]);
                for (int i = 0; i < n; i++) {
                    if ((linea = this.asociadosIn.readLine()) != null) {
                        Asociado asociado = leerAsociado(linea,i);
                        this.asociados.add(asociado);
                    }
                }
            } else {
                throw new IOException("VideoRent: Error al leer el "
                            + "archivo de entrada <"+this.strEntrada3+">:"
                            + "linea 1.");
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
        int n;

        try {
            if ((linea = this.accionesIn.readLine()) != null) {
                String[] tokens = linea.split(" ");
                if (tokens.length == 2) {
                    this.numDias = Integer.parseInt(tokens[0]);
                    this.numAcClientes = Integer.parseInt(tokens[1]);
                    if ((linea = this.accionesIn.readLine()) != null) {
                        Pattern p = Pattern.compile("d{2}/d{2}/d{4}");
                        Matcher m = p.matcher(linea);
                        if (m.matches()) {
                            tokens = linea.split("/");
                            if (tokens.length == 3) {
                                this.inicio = new Date(
                                            Integer.parseInt(tokens[2]),
                                            Integer.parseInt(tokens[1]),
                                            Integer.parseInt(tokens[0]));
                                linea = this.accionesIn.readLine();
                                for (int i = 0; i < this.numDias; i++){
                                    linea = this.accionesIn.readLine();
                                    this.crearAccionCliente(linea);
                                }
                            } else {
                                throw new IOException("VideoRent: Error al"
                            + " leer el archivo de entrada <"+
                                        this.strEntrada3+">:"
                            + "linea 2.");
                            }
                        } else {
                            throw new IOException("VideoRent: Error al leer el "
                            + "archivo de entrada <"+this.strEntrada3+">:"
                            + "linea 2.");
                        }
                    } else {
                        throw new IOException("VideoRent: Error al leer el "
                            + "archivo de entrada <"+this.strEntrada3+">:"
                            + "linea 2.");
                    }
                } else {
                    throw new IOException("VideoRent: Error al leer el "
                            + "archivo de entrada <"+this.strEntrada3+">:"
                            + "linea 1." +
                            "Se esperaban dos elementos. Encontrado:\n"
                    + "'" + linea + "'");
                }
            } else {
                throw new IOException("VideoRent: Error al leer el "
                            + "archivo de entrada <"+this.strEntrada3+">:"
                            + "linea 1.");
            }

            while ((linea = this.accionesIn.readLine()) != null) {
                Accion accion = crearAccionCliente(linea);
                this.accClientes.add(accion);
            }
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }
    
    private void procesar() throws Exception {
        //si c=='a', alguien se kiere asociar. leo ac1 
        for(int y=0;y<numDias;y++){
            Accion ac1 = accClientes.get(y);   
            char c = ac1.getId();
            int aux = 0;
            if (c=='a') {
                Asociarse asociar = (Asociarse)ac1;                
                Asociado aso =  new Asociado(String.valueOf(this.proxIdCliente),
                    asociar.getTipoMembresia().toUpperCase().charAt(0), 
                    asociar.getTipoMembresia(), asociar.getCedula(), 
                    asociar.getNombre(), asociar.getApellido(), 
                    asociar.getTelefono(), asociar.getDireccion());
               this.asociados.add(aso);  
               
            } else if (c=='t') {
                // Actualizo la tarjeta y busco a su dueño en asociados y los 
                // asigno mutuamente
                ActualizarTarjeta actualizar = (ActualizarTarjeta)ac1;
                for(int j=0;j<this.asociados.size();j++){
                    Asociado asoci = this.asociados.get(j);
                    if(asoci.getCodigo().equals(actualizar.getCodCliente())){
                        aux = this.asociados.indexOf(asoci);
                    }
                }
                if (aux==0){
                    throw new Exception ("Error : El dueño de esa tarjeta no esta asociado");
                }
                String[] strFecha = actualizar.getVencimiento().split("/");
                TarjetaCredito tarjeta = new TarjetaCredito(
                        Long.parseLong(actualizar.getNumTarjeta()), actualizar.getBanco(),
                        Integer.parseInt(actualizar.getCodSeguridad()), new Date(
                                Integer.parseInt(strFecha[1]),
                                Integer.parseInt(strFecha[0]),1),
                        null);
                this.asociados.get(aux).setTarjeta(tarjeta);
                tarjeta.setDuenio(this.asociados.get(aux));
                                
            } else if (c=='c') {
                t = new LlevarParaCompra(tokens[1],tokens[2]);
            } else if (c=='r') {
                t = new LlevarParaAlquiler(tokens[1],tokens[2]);
            } else if (c=='p') {
                //sacar del carrito y hacer factura asociada
                t = new Pagar(tokens[1], Double.parseDouble(tokens[2]));
            } else if(tipoOp.equals("b")){
                t = new AbandonarTienda(tokens[1]);
                //limpiar carrito con ese cliente
            } else if(tipoOp.equals("d")){
                t = new DevolverArticulo(tokens[1],tokens[2]);
            } else if(tipoOp.equals("e")){
                t = new PedirRecogerArticulo(tokens[1],tokens[2]);
            }
            numAcClientes;
        }
    }

    /**
     *
     */
    private void escribir() {

    }

    /**
     * Método Main.
     * @param args argumentos de entrada de la linea de comandos.
     */
    public static void main(String[] args) throws IOException {
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