public class Recongnizer extends Shape{
   Shape shape=new Shape();

    public void printNameOfShape(Shape shape){
        this.shape=shape;

        System.out.println(toString()+shape.getClass().getName());
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}
