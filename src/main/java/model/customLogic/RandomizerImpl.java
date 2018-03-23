package model.customLogic;

import model.customLogic.deck.Cards;
import model.customLogic.deck.Suits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizerImpl implements Randomizer {

    private int deckSize;
    private int[] randomArray = new int[deckSize];

    public RandomizerImpl(int cardsQuantity) {
        this.deckSize = cardsQuantity;
    }

    @Override
    public int[] getRandomArray() {
        randomArray = new int[deckSize];
        List<Integer> randomIntList = new ArrayList<>();
        Random random = new Random();

        do {
            Integer randomInt = random.nextInt(deckSize);
            if (!randomIntList.contains(randomInt)) {
                randomIntList.add(randomInt);

            }
        }while (randomIntList.size() < deckSize);

        for (int i = 0; i < deckSize; i++){
            randomArray[i] = randomIntList.get(i);
        }

        return randomArray;
    }

    public static void main(String[] args) {
        RandomizerImpl test1 = new RandomizerImpl(36);
        int[] randomIntList = test1.getRandomArray();

        for(Integer i : randomIntList){
            System.out.print(i + " ");
        }



       /* Cards[] cards = Cards.values();
        Suits[] suits = Suits.values();

        for (Suits suit : suits){

            for (Cards card : cards){
                if(card.getSuit().equals(suit)) {
                    System.out.print(card.getShortName() + " ");
                }
            }
            System.out.println();
        }*/
    }
}
