package videorent;

import java.util.ArrayList;
import java.util.Arrays;
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
