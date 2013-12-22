package edu.uab.cis.agents.blackjack;

import java.util.List;

/**
 * A dealer takes the {@link Action#HIT} action until their cards total 17 or
 * more points. Then the dealer takes the {@link Action#STAND} action.
 */
public class DealerAgent implements Agent {

  @Override
  public Action act(List<Card> cards) {
    throw new UnsupportedOperationException();
  }
}
