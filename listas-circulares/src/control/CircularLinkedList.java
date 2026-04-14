package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
   private Node tail;
   private int size;

   public CircularLinkedList(){
       this.tail = null;
       this.size = 0;
   }
   //Insertar al final de la lista
   public void add(Contact contact){
       Node newNode = new Node(contact);

       if (isEmpty()){
           //lista vacia
           tail = newNode;
           tail.setNext(tail);
       } else {
           //lista con mas de 1 elemento
           newNode.setNext(tail.getNext());
           tail.setNext(newNode);
           tail = newNode;
       }
       size ++;
   }

   // Buscar por nombre
    public Contact findByName(String name){
       if(isEmpty()) return null;

       Node current = tail.getNext();//primer nodo

       do {
           if(current.getValue().getFullName()
                   .equalsIgnoreCase(name)){
               return current.getValue();
           }
           current = current.getNext();
       } while (current != tail.getNext());
       return null;
    }

    public boolean deleteByName(String name){
       if(isEmpty()) return false;

       Node current = tail.getNext();
       Node previous = tail;

       do{
           if(current.getValue().getFullName()
                   .equalsIgnoreCase(name)){

               // Caso 1: Único nodo
               if(current == tail && current.getNext() == tail){
                   tail = null;
               }
               // Caso 2: Eliminar primer nodo
               else if (current == tail.getNext()) {
                   tail.setNext(current.getNext());
               }
               // Caso 3: Eliminar ultimo nodo
               else if (current == tail) {
                   previous.setNext(current.getNext());
                   tail = previous;
               }
               // Caso 4: Eliminar nodo intermedio
                else {
                    previous.setNext(current.getNext());
               }
                size --;
                return true;
           }
           previous = current;
           current = current.getNext();
       } while (current != tail.getNext());
       return false;
    }

    // Mostrar todos los elementos de la lista
    public void listAll(){
       if (isEmpty()){
           System.out.println("Lista Vacia");
           return;
       }

       Node current = tail.getNext();

       do {
           System.out.println(current.getValue());
           current = current.getNext();
       } while(current != tail.getNext());
    }

    // Obtener el tamano de la lista
    public int getSize(){
       return size;
    }

    // Verificar si la lista está vacia
    public boolean isEmpty(){
       return tail == null;
    }
}









