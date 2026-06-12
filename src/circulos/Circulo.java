/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

import figurasGeometricas_.FigurasGeometricas;

/**
 *
 * @author bycha
 */
public class Circulo extends FigurasGeometricas {

    private double radio;
    private static final double PI = Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return radio * 2;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
private double calcularDiametro(){
    return calcularDiametro();
            }
    @Override
    protected double calcularPerimetro() {
        
        return 2 * radio * PI;
    }

    @Override
    protected double calcularArea() {
       
        return Math.pow(radio, 2) * PI;
    }

   

}
