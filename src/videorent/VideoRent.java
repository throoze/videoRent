package videorent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
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
import videorent.articulo.Pelicula;

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

    private BufferedReader in;
    private PrintStream out;
    //private Banco banco;

    public VideoRent() {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = System.out;
        //banco = new Banco();
    }

    public VideoRent(String fin, String fout) {

        this();

        BufferedReader in = null;
        PrintStream out = null;

        try {
            in = new BufferedReader(new FileReader(fin));
            out = new PrintStream(fout);

            // si no hubo error, los asigno a los dos
            this.in = in;
            this.out = out;
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error al crear archivos, usando entrada y" +
                    " salida estandar");
        }
    }

    private Accion crearTransaccion(String linea) {
        String[] tokens = linea.split(" & ");
        String tipoOp = tokens[0];
        Accion t = null;
               
        if (tipoOp.equals("a")) {
            t = new Asociarse(tokens[1],tokens[2],
                            tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],
                            tokens[9],tokens[10]);
        } else if (tipoOp.equals("t")) {
            t = new ActualizarTarjeta(tokens[1],tokens[2]);
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
        }
      
        return t;
    }

    private void procesar() {
        String linea = "";
        try {
            while ((linea = in.readLine()) != null) {
                Accion t = crearTransaccion(linea);
//                Status s = banco.ejecutarTransaccion(t);
                //out.println(s.toString());
            }
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero = "fan";
        String[] arrayString = new String[]{"1", "2", "3", "4"};

        ArrayList<String> actores = new ArrayList<String>(arrayString.length);
        actores.addAll(Arrays.asList(arrayString));
        String[] arrayString2 = new String[]{"1", "2", "3", "5"};

        ArrayList<String> actores2 = new ArrayList<String>(arrayString2.length);
        actores2.addAll(Arrays.asList(arrayString2));

        String nombre = "thor";
        int anio = 2011;
        String formato = "HD";
        String director = "Np";
        String escritor = "BM";
        String secuela = "thor2";
        String genero1 = "fan1";
        Articulo art1 = new Pelicula(genero, actores, nombre, anio, formato, director, escritor, secuela);
        Articulo art2 = new Pelicula(genero, actores, nombre, anio, formato, director, escritor, secuela);
        Articulo art3 = new Pelicula(genero1, actores2, nombre, anio, formato, director, escritor, secuela);
        if(art1.equals(art3)){
        System.out.println("1");
        }
        if(art1.equals(art2)){
        System.out.println("2");
        }
        if(art2.equals(art1)){
        System.out.println("4");
        }
        if(art2.equals(art3)){
        System.out.println("3");
        }
    }
}
