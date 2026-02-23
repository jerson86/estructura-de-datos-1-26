public class App {
    public static void main(String[] args) {

        ListaContactos lista = new ListaContactos();

        lista.insertar(new Contacto("Ana", "300123"));
        lista.insertar(new Contacto("Luis", "301456"));
        lista.insertar(new Contacto("Carlos", "302789"));

        System.out.println("Lista inicial:");
        lista.mostrar();

        System.out.println("\nBuscar Ana:");
        System.out.println(lista.buscar("Ana"));

        System.out.println("\nEliminar Luis:");
        lista.eliminar("Luis");

        System.out.println("\nLista final:");
        lista.mostrar();
    }
}
