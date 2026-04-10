public class ListaContactos {

    private Nodo ultimo;
    private int tamano;

    public ListaContactos() {
        this.ultimo = null;
        this.tamano = 0;
    }

    // Insertar al final
    public void insertar(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);

        if (estaVacia()) {
            // Lista vacía
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            // Lista con elementos
            nuevo.siguiente = ultimo.siguiente; // apunta al primero
            ultimo.siguiente = nuevo;           // el último apunta al nuevo
            ultimo = nuevo;                     // actualizamos último
        }

        tamano++;
    }

    // Buscar por nombre
    public Contacto buscar(String nombre) {
        if (estaVacia()) return null;

        Nodo actual = ultimo.siguiente; // primer nodo

        do {
            if (actual.dato.getNombre().equalsIgnoreCase(nombre)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return null;
    }

    // Eliminar por nombre
    public boolean eliminar(String nombre) {
        if (estaVacia()) return false;

        Nodo actual = ultimo.siguiente;
        Nodo anterior = ultimo;

        do {
            if (actual.dato.getNombre().equalsIgnoreCase(nombre)) {

                // Caso 1: único nodo
                if (actual == ultimo && actual.siguiente == ultimo) {
                    ultimo = null;
                }
                // Caso 2: eliminar primero
                else if (actual == ultimo.siguiente) {
                    ultimo.siguiente = actual.siguiente;
                }
                // Caso 3: eliminar último
                else if (actual == ultimo) {
                    anterior.siguiente = actual.siguiente;
                    ultimo = anterior;
                }
                // Caso 4: nodo intermedio
                else {
                    anterior.siguiente = actual.siguiente;
                }

                tamano--;
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;

        } while (actual != ultimo.siguiente);

        return false;
    }

    // Mostrar todos los contactos
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = ultimo.siguiente;

        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
    }

    // Obtener tamaño
    public int getTamano() {
        return tamano;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return ultimo == null;
    }
}