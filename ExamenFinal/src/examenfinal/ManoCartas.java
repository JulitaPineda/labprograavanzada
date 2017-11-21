/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Julita
 */
public abstract class ManoCartas {
    List<Carta> Cartas = null;
    
    public ManoCartas(){
        Cartas = new ArrayList();
    }
    
    public void agregarCarta(String valor, String categoria) throws Exception{
        if (!categoria.toUpperCase().equals("CORAZONES") || !categoria.toUpperCase().equals("ESPADAS") || !categoria.toUpperCase().equals("DIAMANTES") ||
                !categoria.toUpperCase().equals("TREBOLES"))
            throw new Exception("La categoría utilizada no es correcta.");
        Cartas.add(new Carta(valor, categoria));
    }
    
    public void jugar(String categoria){
        boolean elimino = false;
        for (int i = 0; i < Cartas.size(); i++){
            if (Cartas.get(i).categoria.toUpperCase().equals(categoria.toUpperCase())){
                elimino = true;
                i = Cartas.size();
                Cartas.remove(i);
            }
        }
        if (!elimino){
            Random random = new Random();
            int numeroRandom = random.nextInt(Cartas.size());
            Cartas.remove(numeroRandom);
        }
    }
}