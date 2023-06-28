package circle;
//this is the concept class or the process class
class CircleProcess {
    double radius;
    CircleProcess(){
        this(28);
    }
    CircleProcess(double newRadius){
        radius = newRadius;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
/*this is the result or tested class,
the public class must have the same name with the class*/
public class Circle{
    public static void main(String[] args){
        // "new" is to make(initialize) an object of a Circle Process class
        // circle1, circle2, and circle3 are a references
        CircleProcess circle1 = new CircleProcess();
        circle1.setRadius(1);
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        CircleProcess circle2 = new CircleProcess();
        circle2.setRadius(7);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        CircleProcess circle3 = new CircleProcess();
        circle3.setRadius(14);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        
        /* modify or change the value of circle2 */
        circle2.radius = 21;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}
