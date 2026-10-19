public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        System.out.println(MathTools.randInt(1,3));
        System.out.println(MathTools.round(1.175,2));

        Point a = new Point(0,0);
        Point b = new Point(2,3);
        System.out.println(a.getX());
        System.out.println(MathTools.distance(a, b));
    }
}
