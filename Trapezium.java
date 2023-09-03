public class Trapezium extends Shape{
    private int parallelSide1;
    private int parallelSide2;
    private int height;

    public Trapezium(int parallelSide1, int parallelSide2, int height) {
        if (parallelSide1 <= 0 || parallelSide2 <= 0 || height <= 0) {
            throw new IllegalArgumentException("Sides and height must be higher than 0");
        }
        this.parallelSide1 = parallelSide1;
        this.parallelSide2 = parallelSide2;
        this.height = height;
    }
    @Override
    public double getArea(){
        return (0.5) * (parallelSide1 + parallelSide2) * height;
    }
}
