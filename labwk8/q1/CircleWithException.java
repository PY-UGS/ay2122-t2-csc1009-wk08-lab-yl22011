public class CircleWithException {


    private double radius;
    private double area;
    private double diameter;

    public CircleWithException() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius=radius;

    }

    public double getArea(){

        this.area = radius*radius*3.142;
        return this.area;

    }

    public double getDiameter(){
        this.diameter = 2*radius;
        return this.diameter;
    }

    





}