package com.androidbolivia.androiddesignpatterns.patterns.singleton;

/**
 * Created by Alvaro Orellana on 10/22/16.
 */

public class Level {
    private int level;
    private int stars;

    public Level(int level, int stars) {
        this.level = level;
        this.stars = stars;
    }

    public int getLevel() {
        return level;
    }

    public int getStars() {
        return stars;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Level{");
        sb.append("level=").append(level);
        sb.append(", stars=").append(stars);
        sb.append('}');
        return sb.toString();
    }
}
