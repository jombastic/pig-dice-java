package models;

import org.junit.Test;


import static org.junit.Assert.*;

public class GameTest {
  @Test
  public void Game_createGameInstance() {
    Game testGame = new Game("Player 1");
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void getCurrentPlayer_getPlayerName_String() {
    Game testGame = new Game("Player 1");
    assertEquals("Player 1", testGame.getCurrentPlayer());
  }
}