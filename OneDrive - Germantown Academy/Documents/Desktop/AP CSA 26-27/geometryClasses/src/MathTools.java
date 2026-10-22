public class MathTools {
    //Create the static MathTools methods in this file
    public static int randInt(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static double round(double num, int places) {
        double factor = Math.pow(10,places);
        return (int)(Math.floor(num * factor + 0.5))/factor; //Using floor prevents errors in negative rounding
    }
    public static double distance(Point a, Point b) {
        double xDiff = (a.getX())-(b.getX());
        double yDiff = (a.getY())-(b.getY());
        return MathTools.round(Math.sqrt((Math.pow(xDiff, 2))+(Math.pow(yDiff, 2))), 2);
    }
    public static double slope(Point a, Point b) {
        double xDiff = (a.getX())-(b.getX());
        double yDiff = (a.getY())-(b.getY());
        if (xDiff == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return MathTools.round(yDiff/xDiff, 2);
    }
}

