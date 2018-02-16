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
public class Cuadrado extends Figura {

    @Override
    public void calcularArea() {
        double lado = this.p1.calcularDistancia(this.p2);
        this.area = lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        double lado = this.p1.calcularDistancia(this.p2);
        this.perimetro = lado * 4;
    }
    
    
}
