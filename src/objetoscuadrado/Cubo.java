/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscuadrado;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Cubo extends Cuadrado{
    

    public String calcularVolumen(double lado){
        if(lado>0){
            return (lado*lado)*lado+"";
        }else
        return "";
    }

    
    
   
    
}
