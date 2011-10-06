/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent;

import articulo.Articulo;
import articulo.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class VideoRent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero = "fan";
        String[] arrayString = new String[]{"1", "2", "3", "4"};
        
        ArrayList<String> actores = new ArrayList<String>(arrayString.length);
        for (int i = 0; i < arrayString.length; i++) {
            actores.add(arrayString[i]);
        }
        
        String[] arrayString2 = new String[]{"1", "2", "3", "5"};
         
        ArrayList<String> actores2 = new ArrayList<String>(arrayString2.length);
        for (int i = 0; i < arrayString2.length; i++) {
            actores2.add(arrayString2[i]);
        }
        
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
