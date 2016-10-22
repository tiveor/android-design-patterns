package com.androidbolivia.androiddesignpatterns.patterns.singleton;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Alvaro Orellana on 10/22/16.
 */

public class GameManager {

    public static final String TAG = "SHARED_PREFERENCE_APP";
    public static final String CURRENT_LEVEL = "CURRENT_LEVEL";
    public static final String CURRENT_STARS = "CURRENT_STARS";
    public static final String CURRENT_POINTS = "CURRENT_POINTS";
    public static final String USERNAME = "USERNAME";
    public static final int COIN_WINNER = 10;
    public static final int COIN_USER_FIRST_PLAY = 50;

    private static GameManager instance;

    private Context context;

    private GameManager(Context context) {
        this.context = context;
    }

    public static GameManager getInstance(Context context) {
        if (instance == null) {
            instance = new GameManager(context);
        }
        return instance;
    }

    private SharedPreferences getSharedPreferences() {
        return context.getSharedPreferences(TAG, Context.MODE_PRIVATE);
    }

    public void setUsername(String username) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(USERNAME, username);
        editor.commit();
    }

    public String getUsername() {
        return getSharedPreferences().getString(USERNAME, "");
    }

    public void setCurrentLevel(Level level) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(CURRENT_LEVEL, level.getLevel());
        editor.putInt(CURRENT_STARS, level.getStars());
        editor.commit();
    }

    public Level getCurrentLevel() {
        int level = getSharedPreferences().getInt(CURRENT_LEVEL, 1);
        int stars = getSharedPreferences().getInt(CURRENT_STARS, 1);
        return new Level(level, stars);
    }

    public void incrementWinnerCoin() {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(CURRENT_POINTS, getCurrentCoin() + COIN_WINNER);
        editor.commit();
    }

    public int getCurrentCoin() {
        return getSharedPreferences().getInt(CURRENT_POINTS, COIN_USER_FIRST_PLAY);
    }

    public void decrementCoins(int coins) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(CURRENT_POINTS, getCurrentCoin() - coins);
        editor.commit();
    }
}
