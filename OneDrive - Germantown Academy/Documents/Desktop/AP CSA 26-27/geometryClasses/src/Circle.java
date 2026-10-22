public class Circle {
    private Point c;
    private int r;


    public Circle(Point center, int radius){
        c = center;
        r = radius;

    }
// I added extra method getCenter for fun
    public String getCenter(){
        return (c.getX() + ", " + c.getY());
    }
    

    public int getRadius(){
        return r;
    }

    public double getArea(){
        return MathTools.round((Math.PI)*(Math.pow(r,  2)), 2);
    }
}
