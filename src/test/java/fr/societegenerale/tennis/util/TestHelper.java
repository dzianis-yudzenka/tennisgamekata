/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis.util;

import java.util.stream.IntStream;

import static fr.societegenerale.tennis.util.TestInitializer.*;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TestHelper {
    public static void createScore(int player1Points, int player2Points) {
        IntStream.rangeClosed(1, player1Points).forEach((Integer) -> game.winPoint(player1));
        IntStream.rangeClosed(1, player2Points).forEach((Integer) -> game.winPoint(player2));
    }
}
