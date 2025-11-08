import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock Paper Scissors Game!");
        System.out.println("Enter your choice: rock, paper, or scissors");
        String userChoice = sc.nextLine().toLowerCase();

        // Computer choice
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice = choices[rand.nextInt(3)];

        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        // Game logic
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        }
        else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                 (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                 (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }

        sc.close();
    }
}
