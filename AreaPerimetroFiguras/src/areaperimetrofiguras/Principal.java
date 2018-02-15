/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras;

import static areaperimetrofiguras.Figuras.Figura.FiguraEleccion;
import java.util.Scanner;

/**
 *
 * @author Cheetos
 */
public class Principal {
    
        
    public static void main(String[] args) {
       
        int opcion;
        float area, perimetro;
        
        System.out.println("Por favor seleccione la figura cuyo Area y Perimetro desea conocer:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        Scanner a = new Scanner(System.in);
        opcion = a.nextInt();
        FiguraEleccion();
        
    }
}
