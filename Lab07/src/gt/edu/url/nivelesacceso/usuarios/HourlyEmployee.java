

package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class HourlyEmployee extends Employee{
    
    int hoursPerWeek;
    double hourlyWage;
    
    
    @Override
    protected double monthlyPay(){
        return 1000.00;
    }
    
}
