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
public class ObjetosCuadrado {

    public static void main(String[] args) {
        String entradaTeclado = "";
        double valor = 0.0;
        boolean aux = true;
        Scanner entradaEscaner = new Scanner(System.in);
        Cubo cubo = new Cubo();
        while (aux) {
            System.out.println(" \n Selecciona una opcion: \n 1.- calcular area \n 2.- calcular perimetro \n 3.-calcular volumen  \n 4.- salir");
            entradaTeclado = entradaEscaner.nextLine();
            int op = Integer.parseInt(entradaTeclado);
            switch (op) {
                case 1:
                    System.out.println("\n Ingresa el Lado \n");
                    valor = Double.parseDouble((entradaTeclado = entradaEscaner.nextLine()));
                    System.out.println("El area es: \n" + cubo.calcularArea(valor));
                    break;
                case 2:
                    System.out.println("\n Ingresa el Lado \n");
                    valor = Double.parseDouble((entradaTeclado = entradaEscaner.nextLine()));
                    System.out.println("El perimetro es: \n" + cubo.calcularPerimetro(valor));
                    break;
                case 3:
                    System.out.println("\n Ingresa el Lado \n");
                    valor = Double.parseDouble((entradaTeclado = entradaEscaner.nextLine()));
                    System.out.println("El volumen es: \n" + cubo.calcularVolumen(valor));

                    break;
                case 4:
                    aux = false;
                    break;
            }
        }
    }

}
