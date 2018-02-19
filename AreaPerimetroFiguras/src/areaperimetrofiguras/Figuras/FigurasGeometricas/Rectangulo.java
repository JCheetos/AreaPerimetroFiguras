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
public class Rectangulo extends Figura {

    @Override
    public void calcularArea() {
        double resultado = this.p1.calcularBase(this.p2)*this.p1.calcularAltura(this.p2);
        this.area = resultado;
    }

    @Override
    public void calcularPerimetro() {
        double resultado = (this.p1.calcularBase(this.p2)*2)+(this.p1.calcularAltura(this.p2)*2);
        this.perimetro = resultado;
    }
}
