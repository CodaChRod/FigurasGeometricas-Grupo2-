/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas_;

/**
 *
 * @author bycha
 */
public abstract class FigurasGeometricas {
 private double perimetro;   
 private double area;

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
 public abstract double CalcularPerimetro();
 public abstract double CalcularArea();
     

}
