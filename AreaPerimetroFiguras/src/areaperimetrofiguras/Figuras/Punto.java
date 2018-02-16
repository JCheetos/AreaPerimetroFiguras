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
}
