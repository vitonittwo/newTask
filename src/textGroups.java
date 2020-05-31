import java.util.Scanner;

public class textGroups {

    public static void main(String[] args) {


        String enteredText;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a text!");
            enteredText = scanner.nextLine();

            int countVowel = 0;
            int countConsonant = 0;
            int textLength = enteredText.length();

            for (int i = 0; i < textLength; i++) {
                char textChar1 = enteredText.charAt(i);

                switch (textChar1) {
                    case 'A':
                    case 'E':
                    case 'U':
                    case 'O':
                    case 'I':
                    case 'a':
                    case 'e':
                    case 'u':
                    case 'o':
                    case 'i':
                        ++countVowel;
                        break;
                    case 'q':
                    case 'w':
                    case 'r':
                    case 't':
                    case 'y':
                    case 'p':
                    case 's':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'z':
                    case 'x':
                    case 'c':
                    case 'v':
                    case 'b':
                    case 'n':
                    case 'm':
                    case 'Q':
                    case 'W':
                    case 'R':
                    case 'T':
                    case 'Y':
                    case 'P':
                    case 'S':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'Z':
                    case 'X':
                    case 'C':
                    case 'V':
                    case 'B':
                    case 'N':
                    case 'M':
                        ++countConsonant;
                        break;
                }
            }
            String strThan = " in The Text is greater than ";

            if (enteredText.equals("exit")) {
                String strEqualExit = "You entered \"exit\". The program is completed.";
                System.out.println(strEqualExit);
                break;

            } else {
                if (countVowel == countConsonant) {
                    String strCountEqual = "The Number of Consonants " + countConsonant + " is equally The Number of Vowels " + countVowel;
                    System.out.println(strCountEqual);
                }

                if (countVowel < countConsonant) {
                    String strCountConsonant = "The Number of Consonants " + countConsonant + strThan + "The Number of Vowels " + countVowel;
                    System.out.println(strCountConsonant);
                }
                if (countVowel > countConsonant) {
                    String strCountVowel = "The Number of Vowels " + countVowel + strThan + "The Number of Consonants " + countConsonant;
                    System.out.println(strCountVowel);
                }

              }
        }
                while (enteredText != "exit");

    }
}





