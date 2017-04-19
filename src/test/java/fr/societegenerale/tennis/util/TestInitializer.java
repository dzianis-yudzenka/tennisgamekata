/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis.util;

import fr.societegenerale.tennis.TennisGame;
import fr.societegenerale.tennis.TennisGameImpl;
import fr.societegenerale.tennis.TennisPlayer;
import fr.societegenerale.tennis.TennisPlayerImpl;

import static fr.societegenerale.tennis.util.Constants.FEDERER;
import static fr.societegenerale.tennis.util.Constants.NADAL;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TestInitializer {
    public static TennisPlayer player1;
    public static TennisPlayer player2;
    public static TennisGame game;

    public static void setUp() {
        player1 = new TennisPlayerImpl(FEDERER);
        player2 = new TennisPlayerImpl(NADAL);
        game = new TennisGameImpl(player1, player2);
    }

    public static void tearDown() {
        player1 = null;
        player2 = null;
        game = null;
    }
}
