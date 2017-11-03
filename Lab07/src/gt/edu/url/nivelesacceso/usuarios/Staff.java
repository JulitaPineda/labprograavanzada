
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public class Staff extends SalariedEmployee{
    
    @Override
    public double annualPay(){
        return this.monthlyPay()* 12;
        
    }
    
}
