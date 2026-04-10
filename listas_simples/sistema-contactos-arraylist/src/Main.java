public class Main {
    public static void main(String[] args) {
        SistemaContactos sistema = new SistemaContactos();
        for (int i = 0; i < 100; i++) {
            sistema.insertar(new Contacto("Ana", "300123456", "ana@gmail.com"));
        }

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