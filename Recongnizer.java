public class Recongnizer extends Shape{
    public void printNameOfShape(Shape shape){

        System.out.println(toString()+shape.getClass().getName());
    }

    @Override
    public double getArea() {
        return 0;
    }
}
