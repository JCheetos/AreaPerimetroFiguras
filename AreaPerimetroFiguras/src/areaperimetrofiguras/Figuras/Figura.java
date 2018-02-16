/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras;

/**
 *
 * @author Cheetos
 */
public abstract class Figura{
    public double area;
    public double perimetro;
  
    public Punto p1;
    public Punto p2;
    
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
}
