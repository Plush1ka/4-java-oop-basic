package com.example.task01;

import static java.lang.Math.*;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {

        int subX;
        x *= -1;
        y *= -1;
        subX = x;
        x = y;
        y = subX;
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {

        double distance = sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
        return distance;
    }

    @Override
    public String toString() {

        String xString = Long.toString(x);
        String yString = Long.toString(y);
        return "(" + xString + ", " + yString + ")";
    }
}
