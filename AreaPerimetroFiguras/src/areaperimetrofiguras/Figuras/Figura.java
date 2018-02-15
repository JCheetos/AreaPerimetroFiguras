/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras;

import static areaperimetrofiguras.Figuras.FigurasGeometricas.Circulo.Circulo;
import areaperimetrofiguras.Figuras.FigurasGeometricas.Cuadrado;
import areaperimetrofiguras.Figuras.FigurasGeometricas.Rectangulo;
import static areaperimetrofiguras.Figuras.FigurasGeometricas.Rectangulo.Rectangulo;
import static areaperimetrofiguras.Figuras.FigurasGeometricas.Triangulo.Triangulo;
import areaperimetrofiguras.Principal;
import java.util.Scanner;

/**
 *
 * @author Cheetos
 */
public class Figura extends Principal {
    public static void FiguraEleccion(int opcion) {  
        Scanner a = new Scanner(System.in);
        float x1, x2;
        switch(opcion) {
            case 1:
                Cuadrado CuadradoArea = new Cuadrado();
                System.out.println("Por favor ingrese los valores de los puntos que unen dos esquinas del cuadrado (Un lado)");
                System.out.println("Por favor ingrese el valor del primer punto");
                x1 = a.nextInt();
                System.out.println("Por favor ingrese el valor del segundo punto");
                x2 = a.nextInt();
                CuadradoArea(x1, x2);
                CuadradoPerimetro(x1, x2);
                break;
            case 2:
                Rectangulo RectanguloArea = new Rectangulo();
                System.out.println("Por favor ingrese los valores de los puntos que unen dos esquinas del cuadrado (Un lado)");
                System.out.println("Por favor ingrese el valor del primer punto");
                x1 = a.nextInt();
                System.out.println("Por favor ingrese el valor del segundo punto");
                x2 = a.nextInt();
                RectanguloArea(x1, x2);
                RectanguloPerimetro(x1, x2);
                break;
            case 3:
                Triangulo();
                break;
            case 4:
                Circulo();
                break;
            default:
                break;
        }
    }
}
