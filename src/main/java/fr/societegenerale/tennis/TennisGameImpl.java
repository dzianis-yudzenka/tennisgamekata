/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TennisGameImpl implements TennisGame {
    private final static String[] POINT_VALUES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    private final TennisPlayer player1;
    private final TennisPlayer player2;
    private int player1Points;
    private int player2Points;
    private int player1Sets;
    private int player2Sets;

    public TennisGameImpl(TennisPlayer player1, TennisPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public String getScore() {
        String pointValue;
        String winnerName;
        if (isBothPlayersHaveLessThan40Points() && !isPlayersHave6PointsInSum()) {
            pointValue = POINT_VALUES[player1Points];
            return isPlayersHaveEqualPoints() ? pointValue + "-ALL" : pointValue + "-" + POINT_VALUES[player2Points];
        } else {
            if (isPlayersHaveEqualPoints()) {
                return "DEUCE";
            }
            winnerName = player1Points > player2Points ? player1.getName() : player2.getName();
            winSet(winnerName);
            return isAdvantage() ? "ADVANTAGE " + winnerName : "WIN for " + winnerName;
        }
    }

    @Override
    public String getSetScore() {
        if (getLeadOfSetsScore() >= 6) {
            if (getTrailOfSetsScore() == 5) {
                if (getLeadOfSetsScore() == 7) {
                    return getMatchWinner();
                }
                return "One More Game Must Be Played";
            } else if (getTrailOfSetsScore() <= 4) {
                return getMatchWinner();
            }
            if (player1Sets == 6 && player2Sets == 6) {
                return "TIE-BREAK";
            }
        }
        return String.valueOf(player1Sets) + ", " + player2Sets;
    }

    @Override
    public void winPoint(TennisPlayer player) {
        if (player.getName().equals(player1.getName()))
            this.player1Points += 1;
        else
            this.player2Points += 1;
    }

    @Override
    public void winSet(String playerName) {
        if (playerName.equals(player1.getName())) {
            this.player1Sets += 1;
        } else {
            this.player2Sets += 1;
        }
    }

    @Override
    public boolean gameWon() {
        // 40 not reached or Deuce or Advantage
        return !(isBothPlayersHaveLessThan40Points() && !isPlayersHave6PointsInSum() ||
                isPlayersHaveEqualPoints() ||
                isAdvantage());
    }

    private boolean isAdvantage() {
        return (player1Points - player2Points) * (player1Points - player2Points) == 1;
    }

    private boolean isPlayersHaveEqualPoints() {
        return player1Points == player2Points;
    }

    private boolean isPlayersHave6PointsInSum() {
        return player1Points + player2Points == 6;
    }

    private boolean isBothPlayersHaveLessThan40Points() {
        return player1Points < 4 && player2Points < 4;
    }

    private String getMatchWinner() {
        return "MATCH WIN for " + ((player1Sets > player2Sets) ? player1.getName() : player2.getName()) + "!";
    }

    private int getLeadOfSetsScore() {
        return (player1Sets > player2Sets) ? player1Sets : player2Sets;
    }

    private int getTrailOfSetsScore() {
        return (player1Sets < player2Sets) ? player1Sets : player2Sets;
    }

}
