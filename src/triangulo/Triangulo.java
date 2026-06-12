/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

import figurasGeometricas_.FigurasGeometricas;

/**
 *
 * @author bycha
 */
public abstract class Triangulo extends FigurasGeometricas {

    private double ladoA;
    private double ladoB;
    double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;

    }

    @Override
    protected double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
}
