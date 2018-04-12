import models.Game;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Game newGame = new Game("Player 1");
    do {
      char decision;
      do {
        System.out.println(newGame.getCurrentPlayer());
        System.out.println("---------------------------");
        System.out.println("Choose r to roll or h to hold.");
        decision = (scanner.next().toLowerCase()).charAt(0);
      } while (!newGame.playGame(decision));
    } while (!newGame.winner());
  }
}
