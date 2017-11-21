

package laboratorio8;

import java.util.Scanner;

/**
 *
 * @author Julita
 */
public class Laboratorio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo a cargar");
        String ruta=sc.nextLine();
        DemoGraphviz demo = new DemoGraphviz();
        demo.createDemoFromDot(ruta);
        
    }
    
}
