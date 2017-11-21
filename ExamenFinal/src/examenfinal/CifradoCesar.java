
package examenfinal;

/**
 *
 * @author Julita
 */
public class CifradoCesar {
    
    public String frase;
    public int distancia;
    
    public String cifrarCesar(String frase, int distancia){
        
        
        StringBuilder cifrado = new StringBuilder();
        distancia = distancia % 26;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                if ((frase.charAt(i) + distancia) > 'z') {
                    cifrado.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                    cifrado.append((char) (frase.charAt(i) + distancia));
                }
            } else if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                if ((frase.charAt(i) + distancia) > 'Z') {
                    cifrado.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                    cifrado.append((char) (frase.charAt(i) + distancia));
                }
            }
        }
        return cifrado.toString();
    
    }
}
