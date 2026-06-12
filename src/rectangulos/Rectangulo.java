/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulos;

import figurasGeometricas_.FigurasGeometricas;

/**
 *
 * @author bycha
 */
public class Rectangulo extends FigurasGeometricas {

    double altura;
    double base;
   
  


    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getDiagonal() {
         
     return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
         
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
      
    }

    private double calcularDiagonal() {
      
        return calcularDiagonal();
    }

    @Override
    protected double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
