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
    
    public String cargar(){
        
        JFileChooser selector = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".txt", "txt");
        selector.setFileFilter(filtro);
        
          try{
        selector.showOpenDialog(selector);
        
        
        String path = selector.getSelectedFile().getAbsolutePath();
        String lectura = "";
        
        f = new File(path);
        
      
          
            
             BufferedReader in = new BufferedReader(new InputStreamReader(
                     new FileInputStream(f), "utf-8"));
            
             String aux;
            
            while((aux = in.readLine()) != null){
                lectura = lectura + aux + "\n";
                
            }
            return lectura;
        }
        catch(IOException E){
            
        }
        catch(Exception e){
            
        }
        
        
        return null;
    }

}