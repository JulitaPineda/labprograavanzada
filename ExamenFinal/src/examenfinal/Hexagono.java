
package examenfinal;

/**
 *
 * @author Julita
 */
public class Hexagono implements Poligono{
    
    private double base;
    private double altura;
    private double lado;
    
    public Hexagono(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    public double getArea(){
        return ((this.base*altura)/2)*6;
    }
    
    public double getPerimetro(){
        return (this.lado)*6;
    }
    
    public String toString(){
        return "Rectangle [base " + this.base + " altura " + this.altura
        + " area " + this.getArea() + ", perimetro: " + this.getPerimetro() +
                "]";
    }
}
