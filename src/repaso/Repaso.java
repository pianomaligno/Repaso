/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Víctor
 */
public class Repaso extends javax.swing.JFrame {


    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    //Electrodomestico elec = new Electrodomestico(100.0,50.0,"ojo",'A');
    //elec.precioFinal(elec.getConsumo_energetico(),elec.getPeso());
    Lavadora elec = new Lavadora (100,60,"Rojo",'C',30);
    System.out.println(elec.getColor()+" "+elec.getConsumo_energetico()+" "+elec.getPeso()+" "+elec.getPrecio_base()+" "+elec.getCarga());
    elec.precioFinal(elec.getConsumo_energetico(),elec.peso, elec.getCarga());
    System.out.println(elec.getPrecio_base());
}
 
}
