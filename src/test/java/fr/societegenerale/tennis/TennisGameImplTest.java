/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static fr.societegenerale.tennis.util.Constants.*;
import static fr.societegenerale.tennis.util.TestHelper.createScore;
import static fr.societegenerale.tennis.util.TestInitializer.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TennisGameImplTest {
    @Before
    public void beforeTest() {
        setUp();
    }

    @After
    public void afterTest() {
        tearDown();
    }

    @Test
    public void testScoreLoveAllIfBothPlayersHaveNoPoints() {
        assertThat(game, hasProperty(SCORE, is("Love-ALL")));
    }

    @Test
    public void testScoreLoveFifteenIfPlayer2WinPoint() {
        game.winPoint(player2);
        assertThat(game, hasProperty(SCORE, is("Love-Fifteen")));
    }

    @Test
    public void testScoreFifteenLoveIfPlayer1WinPoint() {
        game.winPoint(player1);
        assertThat(game, hasProperty(SCORE, is("Fifteen-Love")));
    }

    @Test
    public void testScoreFifteenAllIfBothPlayersWinPoint() {
        createScore(1, 1);
        assertThat(game, hasProperty(SCORE, is("Fifteen-ALL")));
    }

    @Test
    public void testScoreThirtyLoveIfPlayer1Win2PointsAndPlayer2HaveNoPoints() {
        createScore(2, 0);
        assertThat(game, hasProperty(SCORE, is("Thirty-Love")));
    }

    @Test
    public void testScoreLoveThirtyIfPlayer1HaveNoPointsAndPlayer2Win2Points() {
        createScore(0, 2);
        assertThat(game, hasProperty(SCORE, is("Love-Thirty")));
    }


    @Test
    public void testScoreFifteenThirtyIfPlayer2Win2PointsAndPlayer1Win1Point() {
        createScore(1, 2);
        assertThat(game, hasProperty(SCORE, is("Fifteen-Thirty")));
    }

    @Test
    public void testScoreFifteenThirtyIfPlayer1Win2PointsAndPlayer2Win1Point() {
        createScore(2, 1);
        assertThat(game, hasProperty(SCORE, is("Thirty-Fifteen")));
    }

    @Test
    public void testScoreThirtyAllIfBothPlayersWin2Points() {
        createScore(2, 2);
        assertThat(game, hasProperty(SCORE, is("Thirty-ALL")));
    }

    @Test
    public void testScoreFortyLoveIfPlayer1Win3PointsAndPlayer2HaveNoPoints() {
        createScore(3, 0);
        assertThat(game, hasProperty(SCORE, is("Forty-Love")));
    }

    @Test
    public void testScoreFortyLoveIfPlayer1HaveNoPointsAndPlayer2Win3Points() {
        createScore(0, 3);
        assertThat(game, hasProperty(SCORE, is("Love-Forty")));
    }

    @Test
    public void testScoreFortyFifteenIfPlayer1Win3PointsAndPlayer1Win1Point() {
        createScore(3, 1);
        assertThat(game, hasProperty(SCORE, is("Forty-Fifteen")));
    }

    @Test
    public void testScoreFifteenFortyIfPlayer1Win1PointAndPlayer2Win3Points() {
        createScore(1, 3);
        assertThat(game, hasProperty(SCORE, is("Fifteen-Forty")));
    }

    @Test
    public void testScoreFortyThirtyIfPlayer1Win3PointsAndPlayer2Win2Points() {
        createScore(3, 2);
        assertThat(game, hasProperty(SCORE, is("Forty-Thirty")));
    }

    @Test
    public void testScoreThirtyFortyIfPlayer1Win2PointsAndPlayer2Win3Points() {
        createScore(2, 3);
        assertThat(game, hasProperty(SCORE, is("Thirty-Forty")));
    }

    @Test
    public void testScoreDeuceIfPlayer1Win3PointsAndPlayer2Win3Points() {
        createScore(3, 3);
        assertThat(game, hasProperty(SCORE, is(DEUCE)));
    }

    @Test
    public void testScoreDeuce2IfPlayer1Win3PointsAndPlayer2Win3Points() {
        createScore(4, 4);
        assertThat(game, hasProperty(SCORE, is(DEUCE)));
    }

    @Test
    public void testPlayer1WonIfWin4PointsInARow() {
        createScore(4, 0);
        assertThat(game, hasProperty(SCORE, is(FEDERER_WON)));
    }

    @Test
    public void testPlayer2WonIfWin4PointsInARow() {
        createScore(0, 4);
        assertThat(game, hasProperty(SCORE, is(NADAL_WON)));
    }

    @Test
    public void testPlayer1WonIfWin4PointsAndPlayer2Win1Point() {
        createScore(4, 1);
        assertThat(game, hasProperty(SCORE, is(FEDERER_WON)));
    }

    @Test
    public void testPlayer2WonIfWin4PointsAndPlayer1Win1Point() {
        createScore(1, 4);
        assertThat(game, hasProperty(SCORE, is(NADAL_WON)));
    }

    @Test
    public void testPlayer1WonIfWin4PointsAndPlayer2Win2Points() {
        createScore(4, 2);
        assertThat(game, hasProperty(SCORE, is(FEDERER_WON)));
    }

    @Test
    public void testPlayer2WonIfWin4PointsAndPlayer1Win2Points() {
        createScore(2, 4);
        assertThat(game, hasProperty(SCORE, is(NADAL_WON)));
    }

    @Test
    public void testPlayer1WonIfWin6PointsAndPlayer2Win4Points() {
        createScore(6, 4);
        assertThat(game, hasProperty(SCORE, is(FEDERER_WON)));
    }

    @Test
    public void testPlayer2WonIfWin6PointsAndPlayer1Win4Points() {
        createScore(4, 6);
        assertThat(game, hasProperty(SCORE, is(NADAL_WON)));
    }

    @Test
    public void testAdvantageWhenLeast3PointsScoredByPlayersAndPlayer2Has1PointMore() {
        createScore(3, 4);
        assertThat(game, hasProperty(SCORE, is(ADVANTAGE_NADAL)));
    }

    @Test
    public void testAdvantageWhenLeast3PointsScoredByPlayersAndPlayer1Has1PointMore() {
        createScore(4, 3);
        assertThat(game, hasProperty(SCORE, is(ADVANTAGE_FEDERER)));
    }

    @Test
    public void testAdvantageWhenLeast4PointsScoredByPlayersAndPlayer2Has1PointMore() {
        createScore(4, 5);
        assertThat(game, hasProperty(SCORE, is(ADVANTAGE_NADAL)));
    }

    @Test
    public void testAdvantageWhenLeast4PointsScoredByPlayersAndPlayer1Has1PointMore() {
        createScore(5, 4);
        assertThat(game, hasProperty(SCORE, is(ADVANTAGE_FEDERER)));
    }

    @Test
    public void testDeuceWhenAtLeast3PointsScoredByEachPlayerAndScoresEqual() {
        createScore(3, 3);
        assertThat(game, hasProperty(SCORE, is(DEUCE)));
        game.winPoint(player1);
        assertThat(game, hasProperty(SCORE, is(not(DEUCE))));
        game.winPoint(player2);
        assertThat(game, hasProperty(SCORE, is(DEUCE)));
    }

    @Test
    public void testGameWonByFirstPlayerToHaveWonAtLeast4PointsInTotalAndWithAtLeast2PointsMoreThanTheOpponent() {
        createScore(4, 3);
        assertThat(game, hasProperty(SCORE, is(not(FEDERER_WON))));
        assertThat(game, hasProperty(SCORE, is(not(NADAL_WON))));
        game.winPoint(player1);
        assertThat(game, hasProperty(SCORE, is(FEDERER_WON)));
    }
}