/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;
import java.util.ArrayList;
import Clase.NuevaPersona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Rodrigo
 */
public class LectorDeArchivos 

{
    public static ArrayList obtenerColeccionDesdeArchivo() throws FileNotFoundException, IOException {
        //clase que representa un archivo como un objeto
        // creo el objeto tipo FILE que representa el archivo txt (a leer)
        File losPaises = new File("src\\Recursos\\Paises.txt");
        //streams = conductos, comunicadores
        //Creo un buffer que leera de a lineas el archivo de texto.
        BufferedReader lector = new BufferedReader(new FileReader(losPaises));
        //filereader lee de 1 caracter a la vez, y solo lee archivos de texto
        // una vez que leyo la linea entera,lo entrega al BufferedReader
        ArrayList coleccion = new ArrayList();
        // algoritmo de lectura
        boolean eof = false;
        String linea = ""; 
        while(!eof)
        {
          linea =  lector.readLine();
            if (linea != null) 
            {
                coleccion.add(linea);
            }
            else
            {
             eof = true;
            }
        }
        
        return coleccion;
                
        
    }
   
    
    
}
