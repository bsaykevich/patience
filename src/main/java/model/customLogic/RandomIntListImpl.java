package model.customLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntListImpl implements RandomIntList{

    private int cardsQuantity;
    List<Integer> randomIntList = new ArrayList<>();

    public RandomIntListImpl(int cardsQuantity) {
        this.cardsQuantity = cardsQuantity;
    }

    @Override
    public List<Integer> getRandomIntList() {

        randomIntList.clear();
        Random random = new Random();

        do {
            Integer randomInt = random.nextInt(cardsQuantity + 1);
            if (!randomIntList.contains(randomInt)) {
                randomIntList.add(randomInt);
            }
        }while (randomIntList.size() < cardsQuantity);

        return randomIntList;
    }

    public static void main(String[] args) {
        RandomIntListImpl test1 = new RandomIntListImpl(36);
        List<Integer> randomIntList = test1.getRandomIntList();

        for(Integer i : randomIntList){
            System.out.print(i + " ");
        }
    }
}
