package com.curaxu.game;

public class Vector {
    private double x = 0, y = 0;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector(Vector v) {
        if (v != null) {
            this.x = v.x;
            this.y = v.y;
        }
    }

    public Vector() {}

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public double lengthSquared() {
        return x * x + y * y;
    }

    public double distanceTo(Vector v) {
        double dx = v.x - x;
        double dy = v.y - y;
        return new Vector(dx, dy).length();
    }

    public Vector normalize() {
        double length = length();
        if (length == 0) return new Vector();
        return this.div(length);
    }

    public double dot(Vector v) {
        return x * v.x + y * v.y;
    }

    public Vector add(Vector v) {
        return new Vector(x + v.getX(), y + v.getY());
    }

    public Vector add(double r) {
        return add(r, r);
    }

    public Vector add(double r, double s) {
        return new Vector(x + r, y + s);
    }

    public Vector sub(Vector v) {
        return new Vector(x - v.getX(), y - v.getY());
    }

    public Vector sub(double r) {
        return sub(r, r);
    }

    public Vector sub(double r, double s) {
        return new Vector(x - r, y - s);
    }

    public Vector mul(Vector v) {
        return new Vector(x - v.getX(), y - v.getY());
    }

    public Vector mul(double r) {
        return mul(r, r);
    }

    public Vector mul(double r, double s) {
        return new Vector(x * r, y * s);
    }

    public Vector div(Vector v) {
        return new Vector(x / v.getX(), y / v.getY());
    }

    public Vector div(double r) {
        return div(r, r);
    }

    public Vector div(double r, double s) {
        return new Vector(x / r, y / s);
    }

    public boolean equals(Vector v) {
        return x == v.x && y == v.y;
    }

    public boolean isZero() {
        return x == 0 && y == 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}