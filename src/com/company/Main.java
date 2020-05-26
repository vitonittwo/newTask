package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter text!");
        String enteredText = scanner.nextLine();

        int enteredTextLength = enteredText.length();
        System.out.println("The text length is: " + enteredTextLength);

        int atlikums0 = 0, atlikums1 = 0, atlikums2 = 0, atlikums3 = 0, atlikums4 = 0;

        for (int i = 0; i < enteredTextLength; i++) {
            char textChar = enteredText.charAt(i);

            switch (textChar%5) {
                case 1:
                  ++atlikums1;
                   break;
                case 2:
                   ++atlikums2;
                    break;
                case 3:
                    ++atlikums3;
                    break;
                case 4:
                    ++atlikums4 ;
                    break;
                case 0:
                    ++atlikums0;
                    break;
            }

        }
        System.out.println("Atlikumus dališanai uz 5 vienadus 0 ir " + atlikums0);
        System.out.println("Atlikumus dališanai uz 5 vienadus 1 ir " + atlikums1);
        System.out.println("Atlikumus dališanai uz 5 vienadus 2 ir " + atlikums2);
        System.out.println("Atlikumus dališanai uz 5 vienadus 3 ir " + atlikums3);
        System.out.println("Atlikumus dališanai uz 5 vienadus 4 ir " + atlikums4);

       }
}
