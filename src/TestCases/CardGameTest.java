package TestCases;

import ClassFiles.CardGame;
import ClassFiles.GameType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createCardGame() {
        //Arrange
        CardGame game = CardGame.createCardGame(GameType.Poker);
        game.setNameOfGame("Poker");

        //Act
        String gameName = game.getNameOfGame();

        //Assert
        assertEquals("Poker",gameName);
    }

    @Test
    void getNameOfGame() {
    }

    @Test
    void setNameOfGame() {
    }

    @Test
    void getNumberOfCards() {
    }

    @Test
    void setNumberOfCards() {
    }
}