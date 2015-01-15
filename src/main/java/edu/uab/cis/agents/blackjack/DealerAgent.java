package edu.uab.cis.agents.blackjack;

import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

/**
 * A dealer takes the {@link Action#HIT} action until their cards total 17 or
 * more points. Then the dealer takes the {@link Action#STAND} action.
 */
public class DealerAgent implements Agent {
  
  @Override
  public Action act(List<Card> cards) {
    int total = 0;
    List<Card> table = cards;
    Map map = new HashMap();
    // Add values.
    map.put("ACE",1);
    map.put("TWO",2);
    map.put("THREE",3);
    map.put("FOUR",4);
    map.put("FIVE",5);
    map.put("SIX",6);
    map.put("SEVEN",7);
    map.put("EIGHT",8);
    map.put("NINE",9);
    map.put("TEN",10);
    map.put("JACK",10);
    map.put("QUEEN",10);
    map.put("KING",10);    
    
    for(Card card : table){
        total = total + (Integer)map.get(card.getRank().toString());
    }
    if( total > 17){
        return Action.STAND;
    }
    else{
        return Action.HIT;
    }

   
  }
}
