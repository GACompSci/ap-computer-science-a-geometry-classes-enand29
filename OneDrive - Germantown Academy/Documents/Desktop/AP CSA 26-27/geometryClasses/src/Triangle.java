public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point p, Point q, Point r){
        a = p;
        b = q;
        c = r; 
    }

    public double getArea(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        //Shoelace theorem for area of triangle
        double area = 0.5*Math.abs(((x1*y2)+(x2*y3)+(x3*y1))-((y1*x2)+(y2*x3)+(y3*x1)));
        return MathTools.round((area), 2);
    }
}
