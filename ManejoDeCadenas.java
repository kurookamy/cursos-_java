/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.cadenas;

/**
 *
 * @author PC15-LAB02
 */
public class ManejoDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="victor";
        String apellido="gallegos";
        System.out.println("concatenacion:"+nombre+apellido);
        
        System.out.println("Nueva Linea:\n"+nombre+" "+apellido);
        System.out.println("tabulacion:\t"+nombre+apellido);
        System.out.println("retroceso:\b"+nombre+apellido);
        System.out.println("retorno de carro:\r"+nombre+apellido);
        System.out.println("comilla simple:\'"+nombre+apellido+"\'");
        System.out.println("commilla doble:\""+nombre+apellido+"\"");
        
       
    }
    
}
