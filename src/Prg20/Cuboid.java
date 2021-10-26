package Prg20;
// child class
public class Cuboid extends Rectangle {

    double height;

    Cuboid( double width, double length , double height) {
        //Calling Super class to initialize value for variables.
        super(width,length);
        // Setting up height value.
         if (height < 0) {
             this.height = 0;
        } else {
            this.height = height;
        }
      }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume = getArea() * getHeight();
        return volume;
    }
// Main method calling both parent and child class.
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }


}



