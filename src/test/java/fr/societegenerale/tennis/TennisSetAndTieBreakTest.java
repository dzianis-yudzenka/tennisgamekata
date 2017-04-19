package fr.societegenerale.tennis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static fr.societegenerale.tennis.util.Constants.*;
import static fr.societegenerale.tennis.util.TestHelper.createSetScore;
import static fr.societegenerale.tennis.util.TestInitializer.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TennisSetAndTieBreakTest {
    @Before
    public void beforeTest() {
        setUp();
    }

    @After
    public void afterTest() {
        tearDown();
    }

    @Test
    public void testBothPlayersHaveNoSets() {
        assertThat(game, hasProperty(SET_SCORE, is("0, 0")));
    }

    @Test
    public void testPlayer1Win1Set() {
        createSetScore(1, 0);
        assertThat(game, hasProperty(SET_SCORE, is("1, 0")));
    }

    @Test
    public void testPlayer2Win1Set() {
        createSetScore(0, 1);
        assertThat(game, hasProperty(SET_SCORE, is("0, 1")));
    }

    @Test
    public void testBothPlayersWin1Set() {
        createSetScore(1, 1);
        assertThat(game, hasProperty(SET_SCORE, is("1, 1")));
    }

    @Test
    public void testPlayer1Win2SetsAndPlayer2Win1Set() {
        createSetScore(2, 1);
        assertThat(game, hasProperty(SET_SCORE, is("2, 1")));
    }

    @Test
    public void testPlayer2Win2SetsAndPlayer1Win1Set() {
        createSetScore(1, 2);
        assertThat(game, hasProperty(SET_SCORE, is("1, 2")));
    }

    @Test
    public void testPlayer1Win2SetsAndPlayer2HaveNoSets() {
        createSetScore(2, 0);
        assertThat(game, hasProperty(SET_SCORE, is("2, 0")));
    }

    @Test
    public void testPlayer2Win2SetsAndPlayer1HaveNoSets() {
        createSetScore(0, 2);
        assertThat(game, hasProperty(SET_SCORE, is("0, 2")));
    }

    @Test
    public void testBothPlayersWin2Sets() {
        createSetScore(2, 2);
        assertThat(game, hasProperty(SET_SCORE, is("2, 2")));
    }

    @Test
    public void testPlayer1Win3SetsAndPlayer2Win1Set() {
        createSetScore(3, 1);
        assertThat(game, hasProperty(SET_SCORE, is("3, 1")));
    }

    @Test
    public void testPlayer2Win3SetsAndPlayer2Win1Set() {
        createSetScore(1, 3);
        assertThat(game, hasProperty(SET_SCORE, is("1, 3")));
    }

    @Test
    public void testPlayer1Win3SetsAndPlayer2HaveNoSets() {
        createSetScore(3, 0);
        assertThat(game, hasProperty(SET_SCORE, is("3, 0")));
    }

    @Test
    public void testPlayer2Win3SetsAndPlayer2HaveNoSets() {
        createSetScore(0, 3);
        assertThat(game, hasProperty(SET_SCORE, is("0, 3")));
    }

    @Test
    public void testPlayer1Win3SetsAndPlayer2Win2Sets() {
        createSetScore(3, 2);
        assertThat(game, hasProperty(SET_SCORE, is("3, 2")));
    }

    @Test
    public void testPlayer2Win3SetsAndPlayer1Win2Sets() {
        createSetScore(2, 3);
        assertThat(game, hasProperty(SET_SCORE, is("2, 3")));
    }

    @Test
    public void testBothPlayersWin3Sets() {
        createSetScore(3, 3);
        assertThat(game, hasProperty(SET_SCORE, is("3, 3")));
    }

    @Test
    public void testMatchWinIfPlayer2Win6SetsInARow() {
        createSetScore(0, 6);
        assertThat(game, hasProperty(SET_SCORE, is(NADAL_WON_MATCH)));
    }

    @Test
    public void testMatchWinIfPlayer1Win6SetsAndPlayer2Win4SetsOrLess() {
        createSetScore(6, 4);
        assertThat(game, hasProperty(SET_SCORE, is(FEDERER_WON_MATCH)));
    }

    @Test
    public void testPlayer1Win6SetsAndPlayer2Win5SetsThenNewGameMustBePlayedAndPlayerWhoWin7SetsWinsMatch() {
        createSetScore(6, 5);
        assertThat(game, hasProperty(SET_SCORE, is("One More Game Must Be Played")));
        game.winSet(player1.getName());
        assertThat(game, hasProperty(SET_SCORE, is(FEDERER_WON_MATCH)));
    }

    @Test
    public void testIf2PlayersWin6SetsTieBreakActivated() {
        createSetScore(6, 6);
        assertThat(game, hasProperty(SET_SCORE, is("TIE-BREAK")));
    }

}
