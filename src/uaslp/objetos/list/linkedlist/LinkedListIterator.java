package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {

    private Node currentNode;

    LinkedListIterator(Node startNode) {
        currentNode = startNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public String next() {
        String data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }
}
