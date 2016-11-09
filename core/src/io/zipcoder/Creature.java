package io.zipcoder;


import squidpony.squidmath.Coord;

/**
 * Created by kenragonese on 11/2/16.
 */
public abstract class Creature{
    private double id;
    private Coord position;
    private int health;
    private int damage;

    public Creature(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public Creature(){
        setId(Math.random());
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Coord getPosition() {
        return position;
    }

    public void setPosition(Coord position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
