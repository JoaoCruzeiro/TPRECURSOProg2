/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author PW
 */
public class Ficheiro implements Serializable {
    
    private static Repositorio rep = null;
    
    public static Repositorio getRepo() {
        if (rep == null) {
            rep = new Repositorio();
        }
        return rep;
    
    }
    
    public static void serializar(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Repositorio.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rep);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    public static void desserializar(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream("Repositorio.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            rep = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Repositorio class not found. " + ex.getMessage());
        }
    }

    
    
}
