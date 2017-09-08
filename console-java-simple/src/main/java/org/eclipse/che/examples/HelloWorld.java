package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Shape a1, b1, c1;
        
        a1 = new Rectangle(10,10); //Toma forma de rectangulo - Polimorficos
        System.out.println(a1.toString());
        
        b1 = new Triangle(10,4); // Toma forma de triangulo - polimorficos
        System.out.println(b1.toString());
        
        c1= new Rectangle (5,5);
        System.out.println(c1.toString());
        
        //Prueba de cambio de formas
        
        //c1= new Rectangle (5,5);
        //System.out.println(c1.toString());
        
        Rectangle rel;
        rel = (Rectangle)c1; //Downcasting
        System.out.println(c1.toString());
        
        c1 = new Triangle(10,2);
        System.out.println(c1.toString());
        
        
        
    }
}
