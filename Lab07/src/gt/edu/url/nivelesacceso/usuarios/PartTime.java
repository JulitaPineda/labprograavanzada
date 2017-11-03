
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public class PartTime extends HourlyEmployee{
    
    @Override
    public double annualPay(){
        return this.monthlyPay()* 12;
        
    }
}
