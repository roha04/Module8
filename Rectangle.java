public class Rectangle extends Shape{
    private int width;
    private int length;


    public Rectangle(int width, int length){
            if (width <= 0 || length <= 0 ) {
                throw new IllegalArgumentException("Sides must be higher than 0");
            }
            this.width=width;
        this.length=length;

    }
    @Override
    public double getArea(){
        double area=width*length;
        return area;
    }
}
