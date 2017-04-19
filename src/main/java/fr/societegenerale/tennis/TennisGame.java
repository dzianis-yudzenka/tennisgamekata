/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public interface TennisGame {
    void winPoint(TennisPlayer player);

    void winSet(String playerName);

    String getScore();

    String getSetScore();

    boolean gameWon();
}
