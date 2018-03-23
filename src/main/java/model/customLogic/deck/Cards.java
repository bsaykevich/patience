package model.customLogic.deck;

public enum Cards {
    CLUBS_ACE(Suits.CLUBS, Ranks.ACE, "cA"),
    CLUBS_TWO(Suits.CLUBS, Ranks.TWO, "c2"),
    CLUBS_THREE(Suits.CLUBS, Ranks.THREE, "c3"),
    CLUBS_FOUR(Suits.CLUBS, Ranks.FOUR, "c4"),
    CLUBS_FIVE(Suits.CLUBS, Ranks.FIVE, "c5"),
    CLUBS_SIX(Suits.CLUBS, Ranks.SIX, "c6"),
    CLUBS_SEVEN(Suits.CLUBS, Ranks.SEVEN, "c7"),
    CLUBS_EIGHT(Suits.CLUBS, Ranks.EIGHT, "c8"),
    CLUBS_NINE(Suits.CLUBS, Ranks.NINE, "c9"),
    CLUBS_TEN(Suits.CLUBS, Ranks.TEN, "cT"),
    CLUBS_JACK(Suits.CLUBS, Ranks.JACK, "cJ"),
    CLUBS_QUEEN(Suits.CLUBS, Ranks.QUEEN, "cQ"),
    CLUBS_KING(Suits.CLUBS, Ranks.KING, "cK"),

    DIAMONDS_ACE(Suits.DIAMONDS, Ranks.ACE, "dA"),
    DIAMONDS_TWO(Suits.DIAMONDS, Ranks.TWO, "d2"),
    DIAMONDS_THREE(Suits.DIAMONDS, Ranks.THREE, "d3"),
    DIAMONDS_FOUR(Suits.DIAMONDS, Ranks.FOUR, "d4"),
    DIAMONDS_FIVE(Suits.DIAMONDS, Ranks.FIVE, "d5"),
    DIAMONDS_SIX(Suits.DIAMONDS, Ranks.SIX, "d6"),
    DIAMONDS_SEVEN(Suits.DIAMONDS, Ranks.SEVEN, "d7"),
    DIAMONDS_EIGHT(Suits.DIAMONDS, Ranks.EIGHT, "d8"),
    DIAMONDS_NINE(Suits.DIAMONDS, Ranks.NINE, "d9"),
    DIAMONDS_TEN(Suits.DIAMONDS, Ranks.TEN, "dT"),
    DIAMONDS_JACK(Suits.DIAMONDS, Ranks.JACK, "dJ"),
    DIAMONDS_QUEEN(Suits.DIAMONDS, Ranks.QUEEN, "dQ"),
    DIAMONDS_KING(Suits.DIAMONDS, Ranks.KING, "dK"),

    HEARTS_ACE(Suits.HEARTS, Ranks.ACE, "hA"),
    HEARTS_TWO(Suits.HEARTS, Ranks.TWO, "h2"),
    HEARTS_THREE(Suits.HEARTS, Ranks.THREE, "h3"),
    HEARTS_FOUR(Suits.HEARTS, Ranks.FOUR, "h4"),
    HEARTS_FIVE(Suits.HEARTS, Ranks.FIVE, "h5"),
    HEARTS_SIX(Suits.HEARTS, Ranks.SIX, "h6"),
    HEARTS_SEVEN(Suits.HEARTS, Ranks.SEVEN, "h7"),
    HEARTS_EIGHT(Suits.HEARTS, Ranks.EIGHT, "h8"),
    HEARTS_NINE(Suits.HEARTS, Ranks.NINE, "h9"),
    HEARTS_TEN(Suits.HEARTS, Ranks.TEN, "hT"),
    HEARTS_JACK(Suits.HEARTS, Ranks.JACK, "hJ"),
    HEARTS_QUEEN(Suits.HEARTS, Ranks.QUEEN, "hQ"),
    HEARTS_KING(Suits.HEARTS, Ranks.KING, "hK"),

    SPADES_ACE(Suits.SPADES, Ranks.ACE, "sA"),
    SPADES_TWO(Suits.SPADES, Ranks.TWO, "s2"),
    SPADES_THREE(Suits.SPADES, Ranks.THREE, "s3"),
    SPADES_FOUR(Suits.SPADES, Ranks.FOUR, "s4"),
    SPADES_FIVE(Suits.SPADES, Ranks.FIVE, "s5"),
    SPADES_SIX(Suits.SPADES, Ranks.SIX, "s6"),
    SPADES_SEVEN(Suits.SPADES, Ranks.SEVEN, "s7"),
    SPADES_EIGHT(Suits.SPADES, Ranks.EIGHT, "s8"),
    SPADES_NINE(Suits.SPADES, Ranks.NINE, "s9"),
    SPADES_TEN(Suits.SPADES, Ranks.TEN, "sT"),
    SPADES_JACK(Suits.SPADES, Ranks.JACK, "sJ"),
    SPADES_QUEEN(Suits.SPADES, Ranks.QUEEN, "sQ"),
    SPADES_KING(Suits.SPADES, Ranks.KING, "sK");

    private Suits suit;
    private Ranks rank;
    private String shortName;

    Cards(Suits suit, Ranks rank, String shortName) {
        this.suit = suit;
        this.rank = rank;
        this.shortName = shortName;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public String getShortName() {
        return shortName;
    }
}
