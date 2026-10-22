public class Circle {
    private Point center;
    private int radius;


    public Circle(Point c, int r){
        center = c;
        radius = r;

    }
// I added extra method getCenter for fun
    public String getCenter(){
        return (center.getX() + ", " + center.getY());
    }
    

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return MathTools.round((Math.PI)*(Math.pow(radius,  2)), 2);
    }
}
