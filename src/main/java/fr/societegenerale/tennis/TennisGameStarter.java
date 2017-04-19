/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

import java.util.Random;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */

class TennisGameStarter {

    public static void main(String[] arg) {
        TennisPlayer[] players = {new TennisPlayerImpl("Federer"), new TennisPlayerImpl("Nadal")};
        String line = "-------------------";
        System.out.println(line);
        System.out.println("| " + players[0] + " | " + players[1] + " |");
        System.out.println(line);
        TennisGame game = new TennisGameImpl(players[0], players[1]);
        Random random = new Random();

        while (!game.gameWon()) {
            game.winPoint(players[random.nextInt(2)]);
            System.out.println(game.getScore());
        }

        System.out.println(line);
    }
}
