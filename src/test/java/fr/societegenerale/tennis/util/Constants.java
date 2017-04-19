/*
 * Copyright © Dzianis Yudzenka, 2017. All rights reserved.
 */

package fr.societegenerale.tennis.util;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/19/2017
 */
public final class Constants {
    public static final String SCORE = "score";
    public static final String SET_SCORE = "setScore";
    public static final String FEDERER = "Roger Federer";
    public static final String NADAL = "Rafael Nadal";
    public final static String DEUCE = "DEUCE";
    public final static String ADVANTAGE = "ADVANTAGE";
    public final static String ADVANTAGE_NADAL = ADVANTAGE + " " + NADAL;
    public final static String ADVANTAGE_FEDERER = ADVANTAGE + " " + FEDERER;
    public final static String FEDERER_WON = "WIN for " + FEDERER;
    public final static String NADAL_WON = "WIN for " + NADAL;
    public final static String FEDERER_WON_MATCH = "MATCH " + FEDERER_WON + "!";
    public final static String NADAL_WON_MATCH = "MATCH " + NADAL_WON + "!";

    private Constants() {
    }
}
