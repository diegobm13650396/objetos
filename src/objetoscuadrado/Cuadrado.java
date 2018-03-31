/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscuadrado;

/**
 *
 * @author diego
 */
public class Cuadrado {
    
    public  String calcularArea(double lado){
        if(lado >0){
            return lado* lado+"";
        }else
        return "valor no valido";
    }
    
    public String calcularPerimetro(double lado){
        if(lado>0){
            return lado*4+"";
        }else
        return "valor no valido";
    }
}
