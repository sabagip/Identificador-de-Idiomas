/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sergio.Betancourt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SABAGIP
 */
public class Archivo {

    File f;
    FileReader lectorArchivo;

    
    /*****************************************************************************
     **************** Metodo que sirve para cargar un archivo .txt ***************
     **************** ************************************************************ 
     */
    public String cargar() {
        // Clase que funciona para cargar la herramienta visual para seleccionar
        // un archivo
        JFileChooser selector = new JFileChooser();
        
        // Con el FileNameExtensionFilter se crea un filtro para que solo se 
        // muestren las carpetas y los archivos con el formato .txt
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".txt", "txt");
        
        // Se asigna el filtro al JFileChooser
        selector.setFileFilter(filtro);
        
        try {
            // Se muestra al usuario el selector de archivos
            selector.showOpenDialog(selector);
            
            // Se toma la ruta path del archivo que el usuario seleccionó
            String path = selector.getSelectedFile().getAbsolutePath();
            
            // Se crea una varible lectura la cual tiene la funcion de tener la 
            // informacion que contiene el archivo .txt seleccionado por el 
            // usuario
            String lectura = "";
            
            // Se asigna la ruta path del archivo a una clase File
            f = new File(path);
            
            // El BufferedReader tiene la funcion de leer la informacion del 
            // archivo seleccionado con la codificacion UTF-8
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    new FileInputStream(f), "utf-8"));
            
            // La variable aux, servirá para almacenar el contenido de cada linea
            // de informacion que contenga el archivo
            String aux;
            
            //Cuando la linea leida en el archivo sea diferente de null
            while ((aux = in.readLine()) != null) {
                
                // Guarda en la variable lectura, lo que tengas ya almacenado en
                // ella mas la nueva linea leida y agregale un salto de linea.
                lectura = lectura + aux + "\n";

            }
            // En caso de que todo halla salido bien regresa la variable lectura
            return lectura;
            
            /**
             * Excepciones en caso de que el try no funcione y el programa no 
             * tenga error de compilacion.
             */
        } catch (IOException E) {

        } catch (Exception e) {

        }
        
        //En caso de que algo halla salido mal, regresa un nulo
        return null;
    }

}
