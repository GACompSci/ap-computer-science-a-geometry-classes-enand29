public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        Point a = new Point(MathTools.randInt(1,100), MathTools.randInt(1,100));
        Point b = new Point(MathTools.randInt(1,100), MathTools.randInt(1,100));

        // Commit 1 printing: 
        System.out.println("\nCommit 1 printing... \n");
        System.out.println("Random integer: " + MathTools.randInt(1,100));
        System.out.println("Point a : " + a.getX() + ", " + a.getY());
        System.out.println("Point b : " + b.getX() + ", " + b.getY());
        System.out.println("Distance, Point a to b: " + MathTools.distance(a, b));
        System.out.println("Slope, Point a to b: " + MathTools.slope(a, b));

        // Commit 2 printing: 
        System.out.println("\nCommit 2 printing... \n");
        Circle circ = new Circle(a, MathTools.randInt(1,100));
        System.out.println("Center of circle: " + circ.getCenter());
        System.out.println("Radius of circle: " + circ.getRadius());
        System.out.println("Area of circle: " + circ.getArea());

        // Commit 3 printing: 
        System.out.println("\nCommit 3 printing... \n");
        Rectangle rect = new Rectangle(a, MathTools.randInt(1,100), MathTools.randInt(1,100));
        System.out.println("Top left point of rectangle: " + rect.getTopLeft());
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}
