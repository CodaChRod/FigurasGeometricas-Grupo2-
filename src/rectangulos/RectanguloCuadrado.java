/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulos;

/**
 *
 * @author bycha
 */
public class RectanguloCuadrado extends Rectangulo {

    public RectanguloCuadrado(double altura, double base) {
        super(altura, base);
    }
     @Override
    protected double calcularPerimetro() {
        return base*4;
    }
      @Override
    protected double calcularArea() {
       
        return Math.pow(base, 2);
    }

}
