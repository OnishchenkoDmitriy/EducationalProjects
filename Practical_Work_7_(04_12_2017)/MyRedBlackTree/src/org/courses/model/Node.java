package org.courses.model;

public class Node {

    private int key;

    private Node parent = null;
    private Node leftChild = null;
    private Node rightChild = null;
    private Node grandParent = null;
    private Node uncle = null;

    public boolean isRed = true;

    public Node(int key) {
        this.key = key;
    }


    public void display(){
        if(isRed){
            System.out.print(Colors.ANSI_RED + key + Colors.ANSI_RESET);
        }else{
            System.out.print(key);
        }


    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getGrandparent(){
        return grandParent = parent.getParent();
    }

    public void setGrandparent(Node node){
        grandParent = node;
    }


    public Node getUncle(){
        if(key > getParent().key){
            return uncle = getGrandparent().getLeftChild();
        }else {
            return uncle =  getGrandparent().getRightChild();
        }
    }

    public void setUncle(Node node){
        if(key > getParent().key){
            getGrandparent().setLeftChild(node);
        }else {
            getGrandparent().setRightChild(node);
        }
    }

}

