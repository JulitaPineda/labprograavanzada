
package examenfinal;

/**
 *
 * @author Julita
 */
public class Triangulo implements Poligono{
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double base, double altura, double lado1, double lado2,
            double lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getArea(){
        return (this.base*altura)/2;
    }
    
    public double getPerimetro(){
        return this.lado1+lado2+lado3;
    }
    
    public String toString(){
        return "Rectangle [base " + this.base + " altura " + this.altura
        + " area " + this.getArea() + ", perimetro: " + this.getPerimetro() +
                "]";
    }
    
}
