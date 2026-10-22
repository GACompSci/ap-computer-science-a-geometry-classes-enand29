public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        Point a = new Point(MathTools.randInt(1,100), MathTools.randInt(1,100));
        Point b = new Point(MathTools.randInt(1,100), MathTools.randInt(1,100));

        // Commit 1 printing: 
        System.out.println("\nCommit 1 printing... \n");
        System.out.println(MathTools.randInt(1,100));
        System.out.println(a.getX() + ", " + a.getY());
        System.out.println(b.getX() + ", " + b.getY());
        System.out.println(MathTools.distance(a, b));
        System.out.println(MathTools.slope(a, b));
        


        // Commit 2 printing: 
        System.out.println("\nCommit 2 printing... \n");
        Circle circ = new Circle(a, MathTools.randInt(1,100));
        System.out.println(circ.getCenter());
        System.out.println(circ.getRadius());
        System.out.println(circ.getArea());
    }
}
