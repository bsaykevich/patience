package model.customLogic;

import model.customLogic.deck.Cards;

import java.util.ArrayList;
import java.util.List;

public class DealResolver {

    private List<Cards> deal = new Deal().getNewDeal();

    /**
     *
     * returns true if match was found and card removed from list
     */
    private boolean resolveOneMatch(List<Cards> deal){

        for(int i = 0; i < deal.size()-2; i++){
            if(deal.get(i).getSuit().equals(deal.get(i+2).getSuit()) ||
                    deal.get(i).getRank().equals(deal.get(i+2).getRank())){
                deal.remove(i);

                for(Cards card : deal){
                    System.out.print(card.getShortName() + " ");
                }
                System.out.println();

                return true;
            }
        }
        return false;
    }

    public List<Cards> resolveAllMatches(List<Cards> deal){
        boolean continueSearch = true;

        do {
            continueSearch = resolveOneMatch(deal);
        } while (continueSearch);

        return deal;

    }

    public static void main(String[] args) {
        Deal deal = new Deal();
        List<Cards> newDeal = deal.getNewDeal();

        for(Cards card : newDeal){
            System.out.print(card.getShortName() + " ");
        }

        System.out.println();
        System.out.println();

        DealResolver dealResolver = new DealResolver();

        List<Cards> result = dealResolver.resolveAllMatches(newDeal);

        for(Cards card : result){
            System.out.print(card.getShortName() + " ");
        }
    }
}
