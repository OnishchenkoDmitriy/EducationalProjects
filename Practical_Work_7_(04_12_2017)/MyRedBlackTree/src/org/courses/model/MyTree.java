package org.courses.model;

import java.util.Stack;

public class MyTree {

    private Node root;

    public MyTree() {
        this.root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.getKey() != key) {
            if (key < current.getKey()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            root.isRed = false;

        } else {
            Node current = root;
            Node parent;


            while (true) {
                parent = current;

                if (key < current.getKey()) {

                    return;
                } else {

                    current = current.getRightChild();
                    if (current == null) {

                        parent.setRightChild(newNode);
                        newNode.setParent(parent);

                        System.out.println("Here");

                        if (newNode.getGrandparent() != null) {

                            if (newNode.getUncle() == null | !newNode.getUncle().isRed) {
                                System.out.println("Case 3");
                                leftRotate(newNode);

                            }else if (newNode.getUncle().isRed) {
                                System.out.println("Case 1");
                                newNode.getParent().isRed = false;
                                newNode.getUncle().isRed = false;
                            }

                        }
                        return;
                    }

                }
            }
        }
    }



    private void leftRotate(Node newNode) {
        Node pivot = newNode.getParent();

        if (pivot.getGrandparent() != null) {
            pivot.getParent().setRightChild(pivot.getLeftChild());
            pivot.setLeftChild(pivot.getParent());
            pivot.getGrandparent().setRightChild(pivot);

            pivot.isRed = false;
            pivot.getLeftChild().isRed = true;
        } else {
            newNode.getGrandparent().setRightChild(pivot.getLeftChild());
            pivot.setLeftChild(newNode.getGrandparent());
            root = pivot;
            pivot.setParent(null);

            root.isRed = false;
            root.getLeftChild().isRed = true;
        }
    }


    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "................................................................................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    temp.display();
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null ||
                            temp.getRightChild() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(
                "................................................................................................");
    }


}


