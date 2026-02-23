public class Main {
    public static void main(String[] args) {
        SistemaContactos sistema = new SistemaContactos();

        sistema.insertar(new Contacto("Ana", "300123456", "ana@gmail.com"));
        sistema.insertar(new Contacto("Luis", "301654321", "luis@gmail.com"));

        System.out.println("Mostrar contactos:");
        sistema.mostrar();

        System.out.println("Buscar Ana:");
        System.out.println(sistema.buscar("Ana"));

        System.out.println("Eliminar a Luis:");
        sistema.eliminar("Luis");

        System.out.println("Mostrar contactos:");
        sistema.mostrar();
    }
}