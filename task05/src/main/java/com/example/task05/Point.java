package com.example.task05;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private double x;
    private double y;


    public Point(double x, double y) {

        setX(x);
        setY(y);
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double getLength(Point point) {

        double distance = sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
        return distance;
    }

}
