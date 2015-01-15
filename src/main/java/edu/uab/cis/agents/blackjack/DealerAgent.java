package edu.uab.cis.agents.blackjack;

import java.util.List;
import java.util.Iterator;
import java.util.EnumMap;

/**
 * A dealer takes the {@link Action#HIT} action until their cards total 17 or
 * more points. Then the dealer takes the {@link Action#STAND} action.
 */
public class DealerAgent implements Agent {
  
  public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
  }

  /**
   * The suit of a card
   */
  public enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
  }

  @Override
  public Action act(List<Card> cards) {
    int total = 0;
    List<Card> table = cards;
    EnumMap<Rank, Integer> map = new EnumMap<Rank, Integer>(Rank.class);
    
    // Add values.
    map.put(Rank.ACE,1);
    map.put(Rank.TWO,2);
    map.put(Rank.THREE,3);
    map.put(Rank.FOUR,4);
    map.put(Rank.FIVE,5);
    map.put(Rank.SIX,6);
    map.put(Rank.SEVEN,7);
    map.put(Rank.EIGHT,8);
    map.put(Rank.NINE,9);
    map.put(Rank.TEN,10);
    map.put(Rank.JACK,10);
    map.put(Rank.QUEEN,10);
    map.put(Rank.KING,10);
    
    for(Card card : table){
        total = total + (Integer)map.get(card.getRank());
    }
    if( total > 17){
        return Action.STAND;
    }
    else{
        return Action.HIT;
    }

   
  }
}
