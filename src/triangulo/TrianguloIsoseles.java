/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author bycha
 */
public class TrianguloIsoseles extends Triangulo{
    private double ladoAB;
    public TrianguloIsoseles(double ladoAB, double ladoC){
         super(ladoAB, ladoAB, ladoC);   
    }
    @Override
    protected double calcularArea() {
        return (ladoC/2) Math.pow(ladoAB , 2)-(ladoC/2);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

