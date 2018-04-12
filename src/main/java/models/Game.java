package models;

import java.util.Random;

public class Game {
  private String currentPlayer;

  public Game(String currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public int randomDice() {
    Random random = new Random();
    return random.nextInt((6 - 1) + 1) + 1;
  }
}
