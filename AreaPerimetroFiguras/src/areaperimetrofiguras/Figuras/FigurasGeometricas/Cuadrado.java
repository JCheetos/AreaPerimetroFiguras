/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras.FigurasGeometricas;

import areaperimetrofiguras.Figuras.Figura;
import java.util.Scanner;

/**
 *
 * @author Cheetos
 */
public class Cuadrado extends Figura {
    public float CuadradoArea(float x1, float x2)
    {
        float resultado, b;
        b = x2-x1;
        resultado = b*b;
        return resultado;
    }
    public float CuadradoPerimetro(float x1, float x2)
    {
        float resultado, b;
        b = x2-x1;
        resultado = b*4;
        return resultado;
    }
    
}
