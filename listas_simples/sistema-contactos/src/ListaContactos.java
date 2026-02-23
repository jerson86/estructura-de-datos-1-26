public class ListaContactos {

    private Nodo cabeza;

    public ListaContactos() {
        cabeza = null;
    }

    // Insertar al final
    public void insertar(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Buscar
    public Contacto buscar(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato.nombre.equalsIgnoreCase(nombre)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Eliminar
    public boolean eliminar(String nombre) {
        if (cabeza == null) return false;

        // Si es el primero
        if (cabeza.dato.nombre.equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            if (actual.siguiente.dato.nombre.equalsIgnoreCase(nombre)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Mostrar
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
