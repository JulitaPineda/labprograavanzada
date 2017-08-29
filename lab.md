# Laboratorio 2

## 1.Comprobar la versión de Java disponible en su sistema (compilador y ejecución)
![Version Java](https://github.com/JulitaPineda/labprograavanzada/issues/1)

## 2.Crear una cuenta en GitHub y utilizarla en EclipseChe

![Crear cuenta en gitHub, regristro](https://github.com/JulitaPineda/labprograavanzada/issues/2)  

![Usarla en EclipseChe](https://github.com/JulitaPineda/labprograavanzada/issues/3)

## 3.Implementar los siguientes diagramas en EclipseChe

### A. Agregación

public class Point {
    
    int x=0;
    int y=0;
    
    public void Point() {
		
	  }
    
    public Point(int x, int y){
        this.x = x;
        this.y= y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public String toString(){
        return "ToString";
    }
    
    public void setxy(int X, int Y) {
		     this.X = X;
		     this.Y = Y;
	  }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setxy(int X, int Y) {
		    this.X = X;
		    this.Y = Y;
   	}
	
   	public double Distance1 (double X2, double Y2) {
		    double Distance1 = (double)Math.sqrt((Math.pow((X2-X), 2)+ Math.pow((Y2-Y), 2)));
		    return Distance1;	
	  }
    
	  public double Distance(double Distance1) {
		    return Distance1; 
    }
}

public class Line {
    
    Point begin; 
    Point end;
    
    public Line(int x1, int y1, int x2, int y2){
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x1);
        end.setY(y1);
    }
    
    public Line(Point begin, Point end){
        
    }
    
    public Point getbegin(){
        return begin;
    }
    
    public void setbegin(Point begin){
        this.begin=begin;
    }
    
    public Point getend(){
        return end;
    }
    
    public void setend(Point end){
        this.end=end;
    }
    
}


## 4.
### -¿Qué es Github?
GitHub es una plataforma de desarrollo colaborativo de software para alojar proyectos utilizando el sistema de control de versiones Git.

### -¿Qué es EclipseChe?
Es un entorno de desarrollo en linea, el cual se basa en la nube para que los desarrolladores puedan trabajar de manera local o remota.

### -¿Qué diferencia hay entre agregación y herencia?
Herencia consiste en que una nueva clase que se crea a partir de otra hereda los atributos y metodos. Y en agregaciónes es una relación que define que un objeto es parte de otro objeto.

### -¿Qué relación existe entre herencia y polimorfismo?
La relacion entre herencia y polimorfismo es que ayudan a optimizar la funcionalidad de un programa.
