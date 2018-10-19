package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        String sentence;
        String sp [];
        int i = 0;

        while (i == 0) {
            System.out.println("Please enter in a sentence.");
            sentence = kbInput.nextLine().toUpperCase() + "X";
            if (sentence.equals("EXITX")) {
                i = 1;
            }
            if (i == 0) {
                sp = sentence.split("S\\s*A");
                int occurrences = sp.length - 1;
                System.out.println("There are " + occurrences + " occurrences.\n");
            }
        }
    }
}
