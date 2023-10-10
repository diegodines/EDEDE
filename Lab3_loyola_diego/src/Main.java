

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        for (int i = 0; i < 10; i++) {
            int numeroR= (int)(Math.random()*100+1);

            lista.insertarElemento(numeroR);
        }
        System.out.println("Lista original:");
        lista.imprimirLista();
        // Ordena la lista
        lista.ordenarLista();
        System.out.println("Lista ordenada:");
        lista.imprimirLista();
    }
}