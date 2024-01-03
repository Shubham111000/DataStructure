package Double_circular_link_list;

import Doubli_Linked_List.DNode;

public class Double_circular_link_list {
    DNode root;

    public Double_circular_link_list() {
        root = null;
    }

    public void insertLeft(int data) {
        DNode newNode = new DNode(data);
        if (root == null) {
            root = newNode;
            root.left = root; // Pointing left to itself for circularity
            root.right = root; // Pointing right to itself for circularity
        } else {
            newNode.right = root;
            newNode.left = root.left;
            root.left.right = newNode;
            root.left = newNode;
            root = newNode;
        }
        System.out.println(data + " Inserted at the left");
    }

    public void insertRight(int data) {
        DNode newNode = new DNode(data);
        if (root == null) {
            root = newNode;
            root.left = root; // Pointing left to itself for circularity
            root.right = root; // Pointing right to itself for circularity
        } else {
            newNode.left = root.left;
            newNode.right = root;
            root.left.right = newNode;
            root.left = newNode;
        }
        System.out.println(data + " Inserted at the right");
    }

    public void deleteLeft() {
        if (root == null) {
            System.out.println("List is Empty");
        } else {
            if (root.right == root) {
                root = null;
            } else {
                root.right.left = root.left;
                root.left.right = root.right;
                root = root.right;
            }
            System.out.println("Deleted from the left");
        }
    }

    public void deleteRight() {
        if (root == null) {
            System.out.println("List is Empty");
        } else {
            if (root.right == root) {
                root = null;
            } else {
                root.left.right = root.right;
                root.right.left = root.left;
            }
            System.out.println("Deleted from the right");
        }
    }

    public void printList() {
        if (root == null) {
            System.out.println("List is Empty");
            return;
        }
        DNode current = root;
        do {
            System.out.print(current.data + " ");
            current = current.right;
        } while (current != root);
        System.out.println();
    }

    public static void main(String[] args) {
        Double_circular_link_list circularList = new Double_circular_link_list();

        circularList.insertLeft(10);
        circularList.insertRight(20);
        circularList.insertLeft(5);

        System.out.println("Circular Doubly Linked List after insertions:");
        circularList.printList();

        circularList.deleteLeft();
        circularList.deleteRight();

        System.out.println("Circular Doubly Linked List after deletions:");
        circularList.printList();
    }
}
