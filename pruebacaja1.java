/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author PC15-LAB02
 */
public class pruebacaja1 {
    public static void main (String[] args)
        {
            caja1 v = new caja1(3,2,6);
            int resultado = v.volumen();
            System.out.println("el volumen de la caja es :"+resultado);
        }
}