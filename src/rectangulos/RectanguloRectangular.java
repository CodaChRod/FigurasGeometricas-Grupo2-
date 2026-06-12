/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulos;

/**
 *
 * @author bycha
 */
public class RectanguloRectangular  extends Rectangulo{

    public RectanguloRectangular(double altura, double base) {
        super(altura, base);
    }
    
    @Override
    protected double calcularPerimetro() {
        return 2*base+2*altura;
    }
      @Override
    protected double calcularArea() {
       
        return base * altura;
    }

}
