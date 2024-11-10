package com.mycompany.seguro;
import javax.swing.JOptionPane;
public class Leer {
    public static int entero(String msg){
        int num;
        num =Integer.parseInt(JOptionPane.showInputDialog(msg));
        return num;
    }
    public static double doble(String msg){
        
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
        
    }
    public static String cadena(String msg){

        return JOptionPane.showInputDialog(msg);
    }
    public static void mostrar(String s){
        JOptionPane.showMessageDialog(null,s);
    }
}