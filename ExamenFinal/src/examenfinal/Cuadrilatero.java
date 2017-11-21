
package examenfinal;

/**
 *
 * @author Julita
 */
public class Cuadrilatero implements Poligono{
    
    private double base;
    private double altura;
    private double lado;
    
    public Cuadrilatero(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    public double getArea(){
        return (this.base*altura);
    }
    
    public double getPerimetro(){
        return (this.lado)*4;
    }
    
    public String toString(){
        return "Rectangle [base " + this.base + " altura " + this.altura
        + " area " + this.getArea() + ", perimetro: " + this.getPerimetro() +
                "]";
    }
    
}
