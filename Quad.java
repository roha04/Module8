public class Quad extends Shape {
    private int side;
    public Quad(int side){
        if (side <= 0 ) {
            throw new IllegalArgumentException("Side must be higher than 0");
        }
        this.side=side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
}
