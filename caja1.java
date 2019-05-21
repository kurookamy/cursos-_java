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
public class caja1 {
    int ancho;
        int alto;
        int profundo;
        caja1(){}
        caja1(int ancho,int alto,int profundo){
            this.ancho=ancho;
            this.alto=alto;
            this.profundo=profundo;
    }
        int volumen()
        {
            return ancho*alto*profundo;
        }
}