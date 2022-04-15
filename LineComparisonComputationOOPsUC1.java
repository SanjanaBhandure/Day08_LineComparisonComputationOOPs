package com.Bridgelabz.Day08LineComparisonComputationOOPs;
import java.util.Scanner;

class Point {
    public double x; // co-ordinate x
    public double y; // co-ordinate y
    public double length;

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
}

public class LineComparisonComputationOOPsUC1  {

    public static double lineLength() {
        Point1 point = new Point1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 coordinate: ");
        point.setX((scanner.nextInt()));
        double x1 = point.getX();
        System.out.println("Enter x2 coordinate: ");
        point.setX((scanner.nextInt()));
        double x2 = point.getX();
        System.out.println("Enter y1 coordinate: ");
        point.setY((scanner.nextInt()));
        double y1 = point.getY();
        System.out.println("Enter y2 coordinate: ");
        point.setY((scanner.nextInt()));
        double y2 = point.getY();
        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);
        double length = Math.sqrt(x + y);

        return length;

    }

    public static void main(String[] args) {
        double lineLength = lineLength();
        System.out.println("Length of line is " + lineLength);
    }
}
