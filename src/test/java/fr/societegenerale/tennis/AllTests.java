/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TennisGameImplTest.class,
        TennisPlayerImplTest.class
})
public class AllTests {
}
