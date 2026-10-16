public class MathTools {
    //Create the static MathTools methods in this file
    public static int randInt(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static double round(double num, int places) {
        return (int)((num * (Math.pow(10,places)))+0.5)/Math.pow(10,places);
    }
}
