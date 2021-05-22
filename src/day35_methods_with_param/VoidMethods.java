package day35_methods_with_param;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class VoidMethods {
    public static void printAtoZ() {
        System.out.println("A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, U, R, S, T, U, V, W, X, Y, Z");
    }

    public static void printAToZ() {
        for(char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " | ");
        }
    }

    public static void main(String[] args) {
        printAtoZ();
        System.out.println();
        printAToZ();
        System.out.println();
        printUSFlag();
        System.out.println();
        printUSFlag();
    }

    public static void printUSFlag(){
        System.out.println("------------ FLAG OF UNITED STATES OF AMERICA ------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
