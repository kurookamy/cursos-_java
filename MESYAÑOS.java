/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes.y.años;

/**
 *
 * @author PC15-LAB02
 */
public class MESYAÑOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes =12;
        String estación;
        if (mes== 1|| mes== 2||mes== 12)
        estación="invierno";
        else if (mes == 3||mes== 4||mes== 5)
        estación ="primavera";
         else if (mes== 6||mes== 7||mes== 8)
         estación ="verano";
         else if (mes== 9||mes== 10||mes== 11)
         estación ="otoño";
         else
         estación="mes incorrecto";
         System.out.println (estación);
    }
}
