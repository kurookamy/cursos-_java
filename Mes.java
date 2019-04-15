/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes;

/**
 *
 * @author PC15-LAB02
 */
public class Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes =12;
        String estaciòn;
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estaciòn="invierno";
                break;
            case 3:
            case 4:
            case 5:
                estaciòn ="primavera";
                break;
            case 6:
            case 7:
            case 8:
                estaciòn ="verano";
                break;
            case 9:
            case 10:
            case 11:
                estaciòn ="otoño";
                break;
            default:
                estaciòn="mes incorrecto";
                break;
        }
         System.out.println(estaciòn);
    }
}
