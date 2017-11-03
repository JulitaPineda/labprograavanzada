

package gt.edu.url.nivelesacceso.usuarios;

/**
 * @author t203
 */

public abstract class Employee {
    
    public String name; //Publica
    private int hireYear; //Privada
    protected String country;
    
    public void setHireYear(int hireYear){
        this.hireYear = hireYear;
    }
    
    public int getHireYear(){
        return this.hireYear;
    }
    
    protected abstract double monthlyPay();
    protected abstract double annualPay();
}
