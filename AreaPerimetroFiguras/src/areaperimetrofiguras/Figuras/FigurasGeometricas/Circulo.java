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
public class Circulo extends Figura {

    @Override
    public void calcularArea() {
        double radio = this.p1.calcularDistancia(this.p2);
        this.area = Math.PI * radio * radio;
    }

    @Override
    public void calcularPerimetro() {
        double radio = this.p1.calcularDistancia(this.p2);
        this.perimetro = 2 * Math.PI * radio;
    }

}
