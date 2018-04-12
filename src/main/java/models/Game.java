package models;

import java.util.Random;

public class Game {
  private String currentPlayer;
  private int turnScore;
  private int rolledDice;
  private int player1Score;
  private int player2Score;

  public Game(String currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public String getCurrentPlayer() {
    switch (currentPlayer) {
      case "Player 1" : {
        return currentPlayer + "\nscore: " + player1Score +"\nturn score: " + turnScore;
      }
      default: {
        return currentPlayer;
      }
    }
  }

  public void randomDice() {
    Random random = new Random();
    rolledDice = random.nextInt((6 - 1) + 1) + 1;
  }

  public void addTurnScore() {
    if (rolledDice == 1) {
      turnScore = 0;
      playerChange();
    } else {
      turnScore += rolledDice;
    }
  }

  public boolean playGame(char input) {
    if (input == 'r') {
      randomDice();
      addTurnScore();
      return true;
    } else if (input == 'h') {
      switch (currentPlayer) {
        case "Player 1" : {
          player1Score += turnScore;
          break;
        }
        default: {
          player2Score += turnScore;
          break;
        }
      }
      turnScore = 0;
      playerChange();
      return true;
    } else {
      return false;
    }
  }

  public boolean winner() {
    if (player1Score >= 100) {
      System.out.println("Player 1 wins!");
      return true;
    } else if (player2Score >= 100) {
      System.out.println("Player 2 wins!");
      return true;
    } else {
      return false;
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
