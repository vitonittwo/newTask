import java.util.Scanner;

import static java.util.Arrays.fill;

public class letterMultiplay {

    private static char firstLetter;

    public static void main(String[] args) {

        int repeatTwoExit = 1;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a text!");
            String userText = scanner.nextLine();
            System.out.println("Please enter a count!");
            int userCount = scanner.nextInt();

            int userTextLength = userText.length();

            System.out.println("The Option.");
            System.out.println("If 0 - exit.");
            System.out.println("If 1 - add first letter of text to text count times.");
            System.out.println("If 2 -add last letter of text to text count times.");
            System.out.println("Else - error.");
            System.out.println("Repeat 2 unless exit.");

            System.out.println("Please enter a number!");
            int optionCount = scanner.nextInt();

            if (optionCount == 0) {
                System.out.println("You entered 0. The program is completed.");
                break;
            } else
                {
                if (optionCount == 1) {

                    char firstLetter = userText.charAt(0);
                    int x = 0;
                    while (x < userCount) {
                        System.out.print(firstLetter);
                        x++;
                    }

                    System.out.println(userText);
                }

                if (optionCount == 2)   {

                    if (repeatTwoExit == 2) {
                        System.out.println("You have repeated 2. The program is complete.");
                        break;
                    }
                    else
                        {
                            repeatTwoExit++;
                        char lastLetter = userText.charAt(userTextLength - 1);
                        System.out.print(userText);
                        int y = 0;
                        while (y < userCount) {
                            System.out.print(lastLetter);
                            y++;
                        }
                        System.out.print("\n");
                    }
                    if (optionCount > 2) {
                        System.out.println("Error");
                        // break;
                    }
                }
              }
           }
while (true);
      }
    }


