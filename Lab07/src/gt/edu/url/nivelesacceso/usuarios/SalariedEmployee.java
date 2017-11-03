
package gt.edu.url.nivelesacceso.usuarios;
/**
 *
 * @author t203
 */
public  abstract class SalariedEmployee extends Employee{
    
    int annualSalary;
    
    public SalariedEmployee(){
        name = "Julia";
        setHireYear(1997);
        country = "GT";
    }
    
    @Override
    protected double monthlyPay(){
        return 1000.00;
    }
    
    public abstract double annualPay();

}
