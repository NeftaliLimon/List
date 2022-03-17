package uaslp.objetos.list.linkedlist;

//Modificador de acceso

// El soporte a el pilar: Encapsulación
// private
// public
// package-private / default

class Node <T>{//  -> Las clases solo pueden ser públicas o package-private
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}
