
package grafos;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        Nodo persona1 = new Nodo("Pedro");
        Nodo persona2 = new Nodo("Andrea");
        Nodo persona3 = new Nodo("Jose");
        
        grafo.agregarNodo(persona1);
        grafo.agregarNodo(persona2);
        grafo.agregarNodo(persona3);
        
        Arista amistad1 = new Arista(persona1, persona2);
        Arista amistad2 = new Arista(persona2, persona3);
        Arista amistad3 = new Arista(persona1, persona3);
        
        grafo.agregarArista(amistad1);
        grafo.agregarArista(amistad2);
        grafo.agregarArista(amistad3);
        
        grafo.printGrafo();
    }
}
