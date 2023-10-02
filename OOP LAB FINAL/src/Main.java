import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character C1 = new Character("Blade", 100, 35, 25, 60, 0);
        Character C2 = new Character("Luna", 100, 15, 25, 25, 40);
        Character C3 = new Character("Swordsman", 100, 40, 22, 50, 0);
        Character C4 = new Character("Tanker", 100, 15, 40, 28, 15);

        Character[] players = {C1, C2, C3, C4};

        System.out.println("Player Selection");
        System.out.println("================");
        System.out.println("Choose two players:");

        // Display the available players
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].getName());
        }

        Scanner scanner = new Scanner(System.in);

        // Get the first player's choice
        System.out.print("Enter the number of the first player: ");
        int player1Index = scanner.nextInt() - 1;
        Character player1 = players[player1Index];

        // Get the second player's choice
        System.out.print("Enter the number of the second player: ");
        int player2Index = scanner.nextInt() - 1;
        Character player2 = players[player2Index];

        // Perform a toss to determine who goes first
        System.out.println("\nPerforming a toss to determine who goes first...");
        Random random = new Random();
        boolean player1WinsToss = random.nextBoolean();

        if (player1WinsToss) {
            System.out.println("\n" + player1.getName() + " wins the toss! They will go first.");
            System.out.println(player1.getName() + " vs. " + player2.getName());
        } else {
            System.out.println("\n" + player2.getName() + " wins the toss! They will go first.");
            System.out.println(player2.getName() + " vs. " + player1.getName());
        }

        // Game loop
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            System.out.println("\n--- " + player1.getName() + "'s turn ---");
            displayOptions();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player1.attack(player2);
                    break;
                case 2:
                    player1.defense();
                    break;
                case 3:
                    player1.SpecialMove(player2);
                    break;
                case 4:
                    player1.heal();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (player2.getHealth() <= 0) {
                System.out.println(player1.getName() + " wins the game!");
                break;
            }

            System.out.println("\n--- " + player2.getName() + "'s turn ---");
            displayOptions();

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player2.attack(player1);
                    break;
                case 2:
                    player2.defense();
                    break;
                case 3:
                    player2.SpecialMove(player1);
                    break;
                case 4:
                    player2.heal();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (player1.getHealth() <= 0) {
                System.out.println(player2.getName() + " wins the game!");
                break;
            }
        }

        scanner.close();
    }

    private static void displayOptions() {
        System.out.println("Options:");
        System.out.println("1. Attack");
        System.out.println("2. Defense");
        System.out.println("3. Special Move");
        System.out.println("4. Heal");
        System.out.print("Enter your choice: ");
    }
}
