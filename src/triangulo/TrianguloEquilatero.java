/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author bycha
 */
public class TrianguloEquilatero extends Triangulo {

    private double lado;

    private TrianguloEquilatero(double lado) {
        
        super(lado,lado,lado);
        
    }

    @Override
    protected double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        
    }

}
