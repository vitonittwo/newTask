package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter text!");
        String text = scanner.nextLine();
        System.out.println("Please, enter number!");

        int textLength = text.length();
        System.out.println("The text length is: " + textLength);

        int a = 0, b = 0, c = 0, d = 0;
        int aa = 0, bb = 0, cc = 0, dd = 0;

        for (int i = 0; i < textLength; i++) {
            char textChar = text.charAt(i);

            int atl = textChar%5;
            switch (atl) {
                case 1:
                   a = a + 1;
                   aa = a;
                   break;
                case 2:
                    b = b + 1;
                    bb = b;
                    break;
                case 3:
                    c = c + 1;
                    cc = c;
                    break;
                case 4:
                    d = d + 1;
                    dd = d;
                    break;
                case 0:
                    continue;

            }

        }
        System.out.println("Atlikumus dališanai uz 5 vienadus 1 ir " + aa);
        System.out.println("Atlikumus dališanai uz 5 vienadus 2 ir " + bb);
        System.out.println("Atlikumus dališanai uz 5 vienadus 3 ir " + cc);
        System.out.println("Atlikumus dališanai uz 5 vienadus 4 ir " + dd);

       }
}
