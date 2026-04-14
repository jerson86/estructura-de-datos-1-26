import control.CircularLinkedList;
import model.Contact;

public class Main {
    static int N = 1_000_000;
    static long durationNanoSecs = 1_000_000_000;

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        long start = System.nanoTime();// Inicio de ejecucion
        for (int i=0; i<N; i++){
            list.add(new Contact("Contacto "+ i, "3333"));
        }
        long end = System.nanoTime();// fin de ejecucion
        System.out.println("List add() time: "
                + (double) (end - start) / durationNanoSecs);

        System.out.println("Lista Inicial");
        System.out.println("Tamaño: "+list.getSize());
        //list.listAll();

        start = System.nanoTime();// Inicio de ejecucion
        System.out.println("\nBuscar a Luis:");
        System.out.println(list.findByName("Contacto 999999"));

        end = System.nanoTime();// fin de ejecucion
        System.out.println("List findByName() time: "
                + (double) (end - start) / durationNanoSecs);

        start = System.nanoTime();// Inicio de ejecucion
        System.out.println("\nEliminar a Luis:");
        System.out.println(list.deleteByName("Luis"));

        end = System.nanoTime();// fin de ejecucion
        System.out.println("List deleteByName() time: "
                + (double) (end - start) / durationNanoSecs);

        System.out.println("Lista Final");
        System.out.println("Tamaño: "+list.getSize());
        //list.listAll();
    }
}




