
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.de.atributos;

/**
 *
 * @author victor
 */
public class PRODUCTO 
{
    //atributos de la clase
    String NOMBRE;
    String MARCA;
    String COLOR;
    Double precio;
    
    //contructores 
    public PRODUCTO(String NOMBRE,String MARCA,String COLOR,Double precio){
        this.MARCA=MARCA;
        this.NOMBRE=NOMBRE;
        this.COLOR=COLOR;
        this.precio=precio;
    }
    //contructor vacio
    public PRODUCTO(){
        
    }
    //GETTER Y SETTER
    public String getNOMBRE(){
        return NOMBRE;
    }
    public void setNOMBRE(String NOMBRE){
        this.NOMBRE=NOMBRE;
    }
    public String getMARCA(){
        return MARCA;
    }
     public void setMARCA(String MARCA){
        this.MARCA=MARCA;
     }
     public String getCOLOR(){
        return COLOR;
    }
    public void setCOLOR(String COLOR){
        this.COLOR=COLOR;
    }
    public Double getprecio(){
        return precio;
    }
    public void setprecio(Double precio){
        this.precio=precio;
    }
    //calcular el presio en soles
    public static void main (String[] args)
    {
        int precio=200;
        double igv,precio_final;
        igv =precio*0.19;
        precio_final=precio+igv;
        System.out.println("el igv es:"+igv);
        System.out.println("el precio final es:"+precio_final);
    }
}