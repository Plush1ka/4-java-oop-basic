package com.example.task04;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task04Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(5, 5);

        Line line = new Line(point1, point2);

        System.out.println(line.toString());

        System.out.println(line.isCollinearLine(point3));
    }
}

class Line{

    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    @Override
    public String toString(){
        return "Line{" + p1 + " - " + p2 + "}";
    }

    public boolean isCollinearLine(Point p){

        double dx1 = p2.getX() - p1.getX();
        double dy1 = p2.getY() - p1.getY();
        double dx2 = p.getX() - p1.getX();
        double dy2 = p.getY() - p1.getY();

        double result = (dx1 * dy2) - (dy1 * dx2);

        double eps = 1e-9;
        return Math.abs(result) < eps;
    }

}

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(Point point) {

        double distance = sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
        return distance;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}