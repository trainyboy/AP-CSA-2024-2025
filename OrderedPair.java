public class OrderedPair {
    double x, y;
    public OrderedPair(double x_, double y_){
        x = x_;
        y = y_;
    }
    public OrderedPair(){
        x = 0;
        y = 0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        return new OrderedPair(root1, root2);
    }
    public double findSlope (OrderedPair A, OrderedPair B){
        return (B.getY() - A.getY())/(B.getX() - A.getX());
    }
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x = (A.getX() + B.getX())/2;
        double y = (A.getY() + B.getY())/2;
        return new OrderedPair(x, y);
    }
    public double findArithmeticSeriesSum (double a, double d, int k){
        return (k/2)*(2*a + (k-1)*d);
    }
    public double findGeometricSeriesSum (double a, double r, int k) {
        return a*(Math.pow(r, k) - 1)/(r - 1);
    }
    public int rollDie (int sides){
        return (int)(Math.random()*sides) + 1;
    }


}
