package org.courses;

import org.courses.model.MyTree;

public class Main {

    public static void main(String[] args){

        MyTree theTree = new MyTree();

        /*theTree.insert(50);
        theTree.insert(25);
        theTree.insert(75);
        theTree.insert(12);
        theTree.insert(37);
        theTree.insert(43);
        theTree.insert(30);
        theTree.insert(33);
        theTree.insert(87);
        theTree.insert(93);
        theTree.insert(97);*/


        theTree.insert(1);
        theTree.displayTree();

        theTree.insert(2);
        theTree.displayTree();

        theTree.insert(3);
        theTree.displayTree();

        theTree.insert(4);
        theTree.displayTree();

        theTree.insert(5);
        theTree.displayTree();


        theTree.insert(6);
        theTree.displayTree();

        theTree.insert(7);
        theTree.displayTree();

    }
}
