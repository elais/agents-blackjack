package edu.uab.cis.agents.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * A dealer takes the {@link Action#HIT} action until their cards total 17 or
 * more points. Then the dealer takes the {@link Action#STAND} action.
 */
public class DealerAgent implements Agent {
  
  @Override
  public Action act(List<Card> cards) {
    int total = 0;
    int tempSum = 0;
    List<Card> table = cards;
    Map map = new HashMap();
    List<Integer> values = new ArrayList<Integer>();
    // Add values.

    map.put("ACE",11);
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
        values.add((Integer)map.get(card.getRank().toString()));
        total += (Integer)map.get(card.getRank().toString());
    }
    while(total > 21){
        tempSum = 0;
        values.set(values.indexOf(11), 1);
        for(int i=0; i<values.size(); i++){
            tempSum += values.get(i);
        }
        total = tempSum;
    }
    if(total >= 17){
        return Action.STAND;
    }
    else{
        return Action.HIT;
    }
  }
}
