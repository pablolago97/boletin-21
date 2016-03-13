/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Ficheiros {
    
    public String[] lista = new String[3];

    public void cargarArray() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = JOptionPane.showInputDialog("Escribe algo " + (i + 1) + ":");

        }
    }

    public void organizar() {
        Arrays.sort(lista);
    }

    public void GuardarFichero() throws FileNotFoundException {
        organizar();
        PrintWriter escritor = null;
        try {
            escritor = new PrintWriter(new File("src/boletin21/archivo.txt"));
            for(int i=0;i<lista.length;i++){
                escritor.println((i+1)+ " "+lista[i]);
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");

        } finally {
            escritor.close();
        }
}
    }


