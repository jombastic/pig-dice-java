package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
  @Test
  public void Game_createGameInstance() {
    Game testGame = new Game("Player 1");
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void randomDice_generateRandomDiceNumber_int() {
    Game testGame = new Game("Player 1");
    assertEquals(true, testGame.randomDice() != 0);
  }
}