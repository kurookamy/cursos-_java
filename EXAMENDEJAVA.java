/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.de.java;
package promedio;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class EXAMENDEJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        int [] numeros =new int[g];
        for (int i=0;i<numeros.length;i++){
            System.out.print("numeros["+i+"]=");
            numeros[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("lista de potencia 3");
        for (int i=0;i<numeros.length;i++){
            numeros[i]=numeros[i]*numeros[i]*numeros[i];
            System.out.print(numeros[i]+",");
        }
        System.out.println();
        int prom = prom/numeros.length;
        System.out.println("valor menor al promedio");
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]<=prom){
              System.out.println(numeros[i]+",");  
            }
        }
             System.out.println();
             System.out.println("letras que desea ingresar");
             int le;
             int contle=0;
             letras=variable.nextint();
             Scanner ingresa=new Scanner(System.in);
             string.lista[]=new string(letras);
             for (int i=0;i<numeros.length;i++){
                 System.out.print("letras");
                 lista[i]=ingresar.next();
             }
             System.out.println();
             for (int i=0;i<lista.length;i++){
             System.out.print(lista[]+"");
            }
            System.out.println();
            for (int i=0;i<listas.length;i++){
                if (lista[i]=="a");
                contle=contle+1;
            }
        }
            System.out.println("contiene"+contle+"a");
            string conli[]=new string[a];
            for (int i=0;i<numeros.length;i++){
            switch (int[i]);
                    case 0;
                    conli[i]="a";
                    break;
                    case 1;
                    conli[i]="b";
                    break;
                    case 2;
                    conli[i]="c";
                    break;
                    case 3;
                    conli[i]="d";
                    break;
                    case 4;
                    conli[i]="e";
                    break;
                    case 5;
                    conli[i]="f";
                    break;
                    case 6;
                    conli[i]="g";
                    break;
                    case 7;
                    conli[i]="h";
                    break;
                    case 8;
                    conli[i]="i";
                    break;}
            }
        }
    
