/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras;

import areaperimetrofiguras.Figuras.Figura;
import areaperimetrofiguras.Figuras.FigurasGeometricas.Circulo;

import areaperimetrofiguras.Figuras.FigurasGeometricas.Cuadrado;
import areaperimetrofiguras.Figuras.Punto;
import java.util.Scanner;

/**
 *
 * @author Cheetos
 */
public class Principal {

    public static void main(String[] args) {
//        Figura FiguraEleccion = new Figura();
//        int opcion;
//        float area, perimetro;
//        System.out.println("Por favor seleccione la figura cuyo Area y Perimetro desea conocer:");
//        System.out.println("1. Cuadrado");
//        System.out.println("2. Rectangulo");
//        System.out.println("3. Triangulo");
//        System.out.println("4. Circulo");
//        Scanner a = new Scanner(System.in);
//        opcion = a.nextInt();
//        FiguraEleccion(opcion);   

        Figura figuraEleccion;
        int opcion;
        System.out.println("Por favor seleccione la figura cuyo Area y Perimetro desea conocer:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        Scanner a = new Scanner(System.in);
        opcion = a.nextInt();
        figuraEleccion = crearFigura(opcion);
        
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        System.out.println("Ingrese el valor de x para el primer punto");
        p1.setX(a.nextDouble());
        System.out.println("Ingrese el valor de y para el primer punto");
        p1.setY(a.nextDouble());
        System.out.println("Ingrese el valor de x para el segundo punto");
        p2.setX(a.nextDouble());
        System.out.println("Ingrese el valor de y para el segundo punto");
        p2.setY(a.nextDouble());
        
        figuraEleccion.setP1(p1);
        figuraEleccion.setP2(p2);
        
        figuraEleccion.calcularArea();
        figuraEleccion.calcularPerimetro();
        
        
        System.out.println("el artea es: " + figuraEleccion.getArea());
        System.out.println("el perimetro es " + figuraEleccion.getPerimetro());
    }
    
    
    public static Figura crearFigura(int opcion) {  
        switch(opcion) {
            case 1:
                return new Cuadrado();
            default:
                return new Circulo();
        }
        
    }
}
