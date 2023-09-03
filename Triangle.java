import java.lang.Math;
public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;


    public Triangle(int a,int b,int c){
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be higher than 0");
        }
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double getArea(){
        double semPerimetr = (double) (a+b+c) /2;
        double area = Math.sqrt(semPerimetr*(semPerimetr-a)*(semPerimetr-b)*(semPerimetr-c));
        return area;
    }
}
