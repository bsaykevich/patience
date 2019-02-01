package model.customLogic;

import model.customLogic.deck.Cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deal {

    private static final int DECK_SIZE = 52;

    private List<Cards> deal;

    public Deal() {
        deal = new ArrayList<>();
    }

    public List<Cards> getDeal() {
        return deal;
    }

    public List<Cards> getNewDeal(){
        createNewDeal();
        return getDeal();
    }

    private Cards[] createNewDeal(){
        Cards[] deck = Cards.values();

        Random rnd = ThreadLocalRandom.current();

        for (int i = deck.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Cards a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
        }

        return deck;
    }

    /*public static void main(String[] args) {
        Deal deal = new Deal();
        List<Cards> newDeal = deal.getNewDeal();
        for(Cards card : newDeal){
            System.out.print(card.getShortName() + " ");
        }
    }*/
}
