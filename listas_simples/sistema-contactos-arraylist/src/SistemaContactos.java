import java.util.ArrayList;

public class SistemaContactos {
    private ArrayList<Contacto> lista;

    public SistemaContactos() {
        lista = new ArrayList<>();
    }

    // Insertar
    public void insertar(Contacto c) {
        lista.add(c);
        System.out.println("Contacto agregado.");
    }

    // Buscar
    public Contacto buscar(String nombre) {
        for (Contacto c : lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    // Eliminar
    public boolean eliminar(String nombre) {
        Contacto c = buscar(nombre);
        if (c != null) {
            lista.remove(c);
            return true;
        }
        return false;
    }

    // Mostrar
    public void mostrar() {
        for (Contacto c : lista) {
            System.out.println(c);
        }
    }
}
