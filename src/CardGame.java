public class CardGame {

    private  Integer numberOfCards;
    private String nameOfGame;

    public static CardGame createCardGame (GameType type)
    {
        if (type == GameType.Poker)
        {
            return new PokerGame();
        }
        else if (type == GameType.BlackJack)
        {
            return new BlackJackGame();
        }
        else
            return null;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public Integer getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(Integer numberOfCards) {
        this.numberOfCards = numberOfCards;
    }
}
