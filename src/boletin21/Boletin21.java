/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.FileNotFoundException;

/**
 *
 * @author Pablo
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
          
      Ficheiros obx= new Ficheiros();
        
      obx.cargarArray();
      obx.GuardarFichero();
    }
    }
    

