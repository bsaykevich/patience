package model.customLogic;

import model.customLogic.deck.Cards;

import java.util.ArrayList;
import java.util.List;

public class Deal {

    private static final int DECK_SIZE = 52;

    private List<Cards> deal;
    private Randomizer randomizer;

    public Deal() {
        deal = new ArrayList<>();
        randomizer = new RandomizerImpl(DECK_SIZE);
    }

    public List<Cards> getDeal() {
        return deal;
    }

    public List<Cards> getNewDeal(){
        createNewDeal();
        return getDeal();
    }

    private void createNewDeal(){
        Cards[] sortedDeck = Cards.values();
        int[] randomIntArray = randomizer.getRandomArray();
        deal.clear();
        for(int i = 0; i < DECK_SIZE; i++){
            deal.add(sortedDeck[randomIntArray[i]]);
        }
    }

    /*public static void main(String[] args) {
        Deal deal = new Deal();
        List<Cards> newDeal = deal.getNewDeal();
        for(Cards card : newDeal){
            System.out.print(card.getShortName() + " ");
        }
    }*/
}
