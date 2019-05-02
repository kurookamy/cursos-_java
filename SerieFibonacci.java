/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.fibonacci;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, f = 0;
        int t1 = 1;
        int t2;
        System.out.print("¿cuantos numeros desea generar?");
        n = leer.nextInt();
        for (int i = 1; i <= n; i++ ){
            t2 = f ;
            f = t1 + f ; 
            t1 = t2;
        System.out.println("t1");
       }
    }
}
