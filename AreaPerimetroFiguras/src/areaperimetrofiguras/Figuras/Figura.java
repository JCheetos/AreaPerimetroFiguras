/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras;

import static areaperimetrofiguras.Figuras.FigurasGeometricas.Cuadrado.Cuadrado;
import areaperimetrofiguras.Principal;

/**
 *
 * @author Cheetos
 */
public class Figura extends Principal {
    public static void FiguraEleccion(int opcion) {
        switch(opcion) {
            case 1:
                Cuadrado();
                break;
            case 2:
                Rectangulo();
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
