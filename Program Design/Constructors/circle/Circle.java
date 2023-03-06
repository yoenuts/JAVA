package circle;

//shut up
public class Circle {
    
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double r){
        radius = r;
    }

    //create a method setRadius
    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double perimeterIs() {
        return (2 * Math.PI * radius);
    }

    public double areaIs() {
        return (Math.PI * Math.PI * radius);
    }

    // this one utilizes the toString method. This toString method allows you to 
    // take object and return the following string:

    public String toString() {
        // i remember using string.format in my earlier GUI programs
        return String.format("The radius is %.2f, Perimeter is %.2f and Area is %.2f.", radius, perimeterIs(), areaIs());
    }
}
