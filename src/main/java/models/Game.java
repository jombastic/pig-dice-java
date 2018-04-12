package models;

import java.util.Random;

public class Game {
  private String currentPlayer;
  private int turnScore;
  private int player1Score;
  private int player2Score;

  public Game(String currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public String getCurrentPlayer() {
    return currentPlayer;
  }

  public int randomDice() {
    Random random = new Random();
    return random.nextInt((6 - 1) + 1) + 1;
  }

  public void addScore() {
    int rolledDice = randomDice();
    if (rolledDice == 1) {
      turnScore = 0;
      playerChange();
    }
  }

  public void playerChange() {
    if (currentPlayer.equals("Player 1")) {
      currentPlayer = "Player 2";
    } else {
      currentPlayer = "Player 1";
    }
  }
}
