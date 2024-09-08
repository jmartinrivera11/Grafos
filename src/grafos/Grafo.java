
package grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Nodo> nodos;
    private List<Arista> aristas;
    
    public Grafo() {
        nodos = new ArrayList<>();
        aristas = new ArrayList<>();
    }
    
    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }
    
    public void agregarArista(Arista arista) {
        aristas.add(arista);
    }
    
    public void printGrafo() {
        System.out.println("Nodos:");
        for (Nodo nodo : nodos) {
            System.out.println(nodo.getNombre());
        }
        System.out.println("Aristas:");
        for (Arista arista : aristas) {
            System.out.println(arista.getNodo1().getNombre() 
                    + " - " + arista.getNodo2().getNombre());
        }
    }
}
