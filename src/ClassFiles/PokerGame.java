package ClassFiles;

import ClassFiles.CardGame;
import Interface.ICards;

public class PokerGame extends CardGame implements ICards {

    @Override
    public void shuffle(Integer numberOfCards) {
        System.out.println("The cards have been shuffled in Poker");
    }
}
