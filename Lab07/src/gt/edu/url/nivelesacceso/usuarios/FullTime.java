
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public class FullTime extends HourlyEmployee{
    
    @Override
    public double annualPay(){
        return this.monthlyPay()* 12;
        
    }
}
