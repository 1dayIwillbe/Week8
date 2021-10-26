package Prg19;

public class Circle {

    double radius;

    Circle(double radius){
        if (radius < 0){
            this.radius =0;
        } else {
            this.radius =radius;
        }
    }

    Circle() {
    radius = 0;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
     return area;
    }
}

