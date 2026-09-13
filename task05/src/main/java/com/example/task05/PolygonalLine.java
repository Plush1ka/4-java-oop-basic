package com.example.task05;

public class PolygonalLine {

    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {

        Point[] subPoint = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            Point newPoint = new Point(points[i].getX(), points[i].getY());
            subPoint[i] = newPoint;
        }
        this.points = subPoint;
    }

    public void addPoint(Point point) {

        int lenght = points.length;
        Point[] subPoints = new Point[lenght + 1];

        for (int i = 0; i < lenght; i++){
            Point newPoint = new Point(points[i].getX(), points[i].getY());
            subPoints[i] = newPoint;
        }
        subPoints[lenght] = point;

        points = subPoints;
    }

    public void addPoint(double x, double y) {

        Point newPoint = new Point(x, y);

        int lenght = points.length;
        Point[] subPoints = new Point[lenght + 1];

        for (int i = 0; i < lenght; i++){
            subPoints[i] = points[i];
        }
        subPoints[lenght] = newPoint;

        points = subPoints;
    }

    public double getLength() {

        double summa = 0;

        for (int i = 0; i < points.length - 1; i++){
            summa += points[i].getLength(points[i+1]);
        }

        return summa;
    }

}
