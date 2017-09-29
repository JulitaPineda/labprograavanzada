package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        
        SinglyLinkedList lista = new SinglyLinkedList();
        
        lista.addFirst("GUA");
        lista.addLast("MEX");
        lista.addLast("USA");
        lista.addLast("ESP");
        lista.addLast("FRA");
        lista.addLast("ITA");
        lista.addLast("RUS");
        System.out.println(lista.first());
        
        String valor = lista.removeFirst();
        while(valor != null){
            System.out.println(valor);
            valor = lista.removeFirst();
        }
        
        
        
    }

}
