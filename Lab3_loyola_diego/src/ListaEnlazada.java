public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void insertarElemento(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
    }

    public void imprimirLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public void ordenarLista() {
        if (cabeza == null) {
            return;
        }

        boolean val;
        do {
            val = false;
            Nodo actual = cabeza;
            Nodo siguiente = cabeza.siguiente;
            Nodo anterior = null;
            while (siguiente != null) {
                if (actual.dato > siguiente.dato) {
                    if (anterior != null) {
                        anterior.siguiente = siguiente;
                    } else {
                        cabeza = siguiente;
                    }
                    actual.siguiente = siguiente.siguiente;
                    siguiente.siguiente = actual;
                    val = true;
                }
                anterior = actual;
                actual = siguiente;
                siguiente = siguiente.siguiente;
            }
        } while (val);
    }
}
