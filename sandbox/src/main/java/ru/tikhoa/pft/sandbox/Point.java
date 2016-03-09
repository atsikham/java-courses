package ru.tikhoa.pft.sandbox;

public class Point {
    private double x;
    private double y;

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt( Math.pow( p1.getX() - p2.getX(), 2 ) + Math.pow( p1.getY() - p2.getY(), 2 ) );
    }

    public double distance(Point p){
        return distance(this, p);
    }
}
