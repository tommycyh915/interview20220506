package com.interview1;

public class IndexDecomp {

    /*
                   A
                /     \
              B        C
            / | \    / | \
           D  E  F  G  H  I
                / \
               D   J
     */

    public static void main(String[] args) {
        IndexDecomp indexDecomp = new IndexDecomp();
        indexDecomp.input("A", "B", 0.3);
        indexDecomp.input("A", "C", 0.7);
        indexDecomp.input("B", "D", 0.2);
        indexDecomp.input("B", "E", 0.2);
        indexDecomp.input("B", "F", 0.6);
        indexDecomp.input("C", "G", 0.3);
        indexDecomp.input("C", "H", 0.3);
        indexDecomp.input("C", "I", 0.4);
        indexDecomp.input("F", "D", 0.5);
        indexDecomp.input("F", "J", 0.5);

        System.out.println(indexDecomp.getWeight("A", "B"));
        System.out.println(indexDecomp.getWeight("A", "F"));
        System.out.println(indexDecomp.getWeight("A", "D"));
        System.out.println(indexDecomp.getWeight("B", "J"));
    }


    public void input(String A, String B, double C){
        // write your code here

    }

    public double getWeight(String A, String B){
        // write your code here
        return Double.NaN;
    }
}
