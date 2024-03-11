import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Character player;

    //method to get user input
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
                if (input < 1 || input > userChoices) {
                    System.out.println("Please make a choice out of the options you see.");
                }
            } catch (Exception e) {
                input = -1;
                System.out.println("You need enter a number.");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    //method to empty the screen
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //method to print a separator
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //method to show headings in a clear way
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method to stop the game until any user input
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

    public static String pickMage(String name) {
        boolean mageSet = false;
        String mageType = null;

        clearConsole();
        printHeading("! It's time for you to choose your path, " + name + ". Here are your 4 options: ");
        System.out.println("1 - Illusionist");
        System.out.println("2 - Shade");
        System.out.println("3 - Enchanter");
        System.out.println("4 - Psychic");
        int input = readInt("Your choice: ", 4);
        switch (input) {
            case 1:
                mageType = "Illusionist";
                break;
            case 2:
                mageType = "Shade";
                break;
            case 3:
                mageType = "Enchanter";
                break;
            case 4:
                mageType = "Psychic";
                break;
            default:
        }

        return mageType;
    }

    //method to start the game
    public static void startGame() {
        boolean nameSet = false;
        String name;

        //print title screen
        clearConsole();
        printSeparator(40);
        printSeparator(40);
        System.out.println("Welcome to the Mages of the Prophecy");
        printSeparator(40);
        printSeparator(40);
        anythingToContinue();

        //get player to pick a name
        do {
            clearConsole();
            printHeading("How shall we call you?");
            name = scanner.next();
            //ask player for confirmation
            clearConsole();
            printHeading("Your name is: " + name + ".\nAre you certain?");
            System.out.println("1 - Yes.");
            System.out.println("2 - No.");
            int input = readInt("Your choice: ", 2);
            if (input == 1) {
                nameSet = true;
            }
        } while (!nameSet);

        //let user pick a mage class
        String mageType = pickMage(name);

        //create the player object based on the user choice
        switch (mageType) {
            case "Illusionist":
                player = new Illusionist(name);
                break;
            case "Shade":
                player = new Shade(name);
                break;
            case "Enchanter":
                player = new Enchanter(name);
                break;
            case "Psychic":
                player = new Psychic(name);
                break;
            default:
                player = new Illusionist(name);
        }

        System.out.println(player.mageType);

        //start the main game
        //gameLoop();
    }
}
