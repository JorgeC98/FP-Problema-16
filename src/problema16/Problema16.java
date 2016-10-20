/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema16;
import java.util.*;
/**
 * Este programa sirve para encontrar el número mayor de tres
 * números dados
 * @author JorgeRicardo
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* aqui declare los tres números y una variable mas para almacenar 
        el mayor de los tres*/
    int num1,num2,num3,grande;
    num1=pedirNum("Escribe el primer número: ");
    num2=pedirNum("Escribe el segundo número: ");
    num3=pedirNum("Escribe el tercer número: ");
    grande=calcular(num1,num2,num3);/*en este metodo voy a buscar
                                     al mayor de los 3*/
    mostrarNum(grande);
    }
    //Aqui se piden los tres numeros usando el mismo metodo
    public static int pedirNum(String cual){
    int a;
    Scanner teclear=new Scanner(System.in);
    System.out.println(cual);
    a=teclear.nextInt();
    return a;
    }
    
    public static int calcular(int a,int b,int c){
    if (a>b&&a>c)/*aqui compruebo que a sea mayor que los otros dos numeros
                   si si lo es se regresa a*/
        return a;
                else if (b>a&&b>c)/*aqui checo si b es mayor que los otros dos
                                    números si si lo es se regresa b 
                                    si no se regresa el tercer número*/
                         return b;
                else return c;      
    }
    public static void mostrarNum(int mayor){
    System.out.println("El numero mas grande es: "+mayor);
    }//aqui ya muestro cual fue el número mayor de los tres números dados
}
