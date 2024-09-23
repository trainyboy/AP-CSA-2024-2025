public class driver{
    public static void main(String[] args) {
        circle firstcircle = new circle();
        circle secondcircle = new circle(5);
        System.out.println(firstcircle.toString());
        System.out.println("Area: " + firstcircle.getArea());
        System.out.println("Circumference: " + firstcircle.getCircumference());
        System.out.println("Radius: " + firstcircle.getRadius());

        System.out.println(secondcircle.toString());
        System.out.println("Area: " + secondcircle.getArea());
        System.out.println("Circumference: " + secondcircle.getCircumference());
        System.out.println("Radius: " + secondcircle.getRadius());

        Cyclinder firstcylinder = new Cyclinder();
        Cyclinder secondcylinder = new Cyclinder(5, 5);
        System.out.println(firstcylinder.toString());
        System.out.println("Volume: " + firstcylinder.getVolume());
        System.out.println("Surface Area: " + firstcylinder.getSurfaceArea());
        System.out.println("Radius: " + firstcylinder.getRadius());
        System.out.println("Height: " + firstcylinder.getHeight());

        System.out.println(firstcylinder.toString());
        System.out.println("Volume: " + secondcylinder.getVolume());
        System.out.println("Surface Area: " + secondcylinder.getSurfaceArea());
        System.out.println("Radius: " + secondcylinder.getRadius());
        System.out.println("Height: " + secondcylinder.getHeight());
    }
}
