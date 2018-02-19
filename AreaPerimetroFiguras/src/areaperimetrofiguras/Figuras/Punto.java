/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrofiguras.Figuras;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Punto {
    double x;
    double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularDistancia(Punto p){
        double distancia = Math.sqrt(Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2));
        return distancia;
    }
    
    public double calcularBase(Punto p){
        double distancia = Math.sqrt(Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2));
        double base = Math.sqrt(Math.pow(distancia,2)-Math.pow((this.y - p.y),2));
        return base;
    }
    public double calcularAltura(Punto p){
        double distancia = Math.sqrt(Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2));
        double altura = Math.sqrt(Math.pow(distancia,2)-Math.pow((this.x - p.x),2));
        return altura;
    }
}
