/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presedenciaoperadores;

/**
 *
 * @author victor
 */
public class PresedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("primer ejemplo procedencia operadores");
    int x=5;
    int y=10;
    int z=++x*y--;
    
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("z="+z);
    
    System.out.println("ejemplo evaluacion");
    System.out.println(4+5*6/3);
    System.out.println((4+5)*(4/5));
    
    System.out.println("otro ejemplo evaluacion");
    System.out.println(1+2-3*4/5);
    System.out.println(1+2-(3*(4/5)));
    
    System.out.println("\\notro ejemplo");
    //Si detecta una cadena, lo demas lo convierte en cadana
        System.out.println("1 + 2 = " + 1 + 2);
        //Los parentesis rompen esta regla, ya que tiene la mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));

        System.out.println("\nOtro ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc");//Detecta una operacion primero
        System.out.println("abc" + 1 + 2);//Detecta una cadena primero

        
    }
    
}
