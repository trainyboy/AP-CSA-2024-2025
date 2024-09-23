public class Cyclinder {
    double radius, height;
    circle tmp;
    public Cyclinder(){
        tmp = new circle(1);
        height = 1;
        radius = 1;
    }
    public Cyclinder(double r, double h){
        tmp = new circle(r);
        height = h;
        radius = r;
    }
    public double getVolume(){
        return tmp.getArea() * height;
    }
    public double getSurfaceArea(){
        return 2 * tmp.getArea()+ tmp.getCircumference()*height;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public String toString(){
        return "Hello, I am a cylinder with radius " + radius + " and height " + height;
    }
}
