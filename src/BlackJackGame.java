import Interface.ICards;

public class BlackJackGame extends CardGame implements ICards {

    @Override
    public void shuffle(Integer numberOfCards) {
        System.out.println("The cards have been shuffled in BlackJack");
    }
}
