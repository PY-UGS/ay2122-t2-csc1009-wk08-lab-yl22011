import java.util.Scanner;

public class CircleWithExceptionExample {

    public static boolean checkRadius(double radius) throws IllegalArgumentException{

        if(radius < 0){
            throw new IllegalArgumentException("Radius is less than 0");
        }
        return true;
    }

    public static boolean checkArea(double area) throws Exception{

        if(area > 1000){
            throw new Exception("Area is more than 1000");
        }
        return true;
    }

    public static void main(String[] args) {
        
        CircleWithException circle = new CircleWithException();
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        try {
            checkRadius(radius);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        circle.setRadius(radius);

        try{
            checkArea(circle.getArea());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Diamter is:" + circle.getDiameter());

    }
    
}
