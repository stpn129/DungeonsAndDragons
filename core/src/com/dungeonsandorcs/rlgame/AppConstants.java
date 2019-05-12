package com.dungeonsandorcs.rlgame;
public class AppConstants {
    public static final int LOADING = 0;
    public static final int MENU = 1;
    public static final int GAME = 2;

    public static final float APP_WIDTH = 200;
    public static final float APP_HEIGHT = 400;

    public enum Direction {
        UP,
        UP_LEFT,
        UP_RIGHT,
        RIGHT,
        RIGHT_UP,
        RIGHT_DOWN,
        DOWN,
        DOWN_RIGHT,
        DOWN_LEFT,
        LEFT,
        LEFT_DOWN,
        LEFT_UP
    }

    public static enum Material {
        STEEL, WOOD, RUBBER, STONE
    }

    public static enum Shape {
        SQUARE, CIRCLE, PEGAGON, ARROW
    }
    public static float SPEED = 1/16f;
}