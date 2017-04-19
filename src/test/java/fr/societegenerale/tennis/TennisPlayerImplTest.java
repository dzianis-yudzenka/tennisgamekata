/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static fr.societegenerale.tennis.util.Constants.FEDERER;
import static fr.societegenerale.tennis.util.Constants.NADAL;
import static fr.societegenerale.tennis.util.TestInitializer.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public class TennisPlayerImplTest {
    @Before
    public void beforeTest() {
        setUp();
    }

    @After
    public void afterTest() {
        tearDown();
    }

    @Test
    public void testGetName() {
        assertThat(player1, hasProperty("name", is(FEDERER)));
        assertThat(player2, hasProperty("name", is(NADAL)));
    }
}