package com.company;

public class Punkt {
    public int x;
    public int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void zeruj() {
        this.x = 0;
        this.y = 0;
    }

    public String opis() {
        System.out.println("(" + this.x + "," + this.y + ")");
        return null;
    }

    public void przesun(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
