/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras.FigurasGeometricas;

import areaperimetrofiguras.Figuras.Figura;

/**
 *
 * @author Cheetos
 */
public class Triangulo extends Figura {

    @Override
    public void calcularArea() {
        double resultado = (this.p1.calcularBase(this.p2)*this.p1.calcularAltura(this.p2))/2;
        this.area = resultado;
    }

    @Override
    public void calcularPerimetro() {
        double resultado = this.p1.calcularBase(this.p2)+this.p1.calcularAltura(this.p2)+this.p1.calcularDistancia(this.p2);
        this.perimetro = resultado;
    }
//    public static void calcularArea()
//    {
//        float x1, x2, y1, y2;
//        
//    }
//    public static void calcularPerimetro()
//    {
//        float x1, x2, y1, y2;
//        
//    }
}
