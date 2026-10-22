public class Rectangle {
    private Point topLeft;
    private int length;
    private int width;


    public Rectangle(Point p, int len, int w){
        topLeft = p;
        length = len;
        width = w; 
    }

    //Included getLength and getWidth for debugging/grading purposes, so you can see if getArea is producing correct values
    public double getArea(){
        return MathTools.round(width * length, 2);
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public String getTopLeft(){
        return (topLeft.getX() + ", " + topLeft.getY());
    }
}
