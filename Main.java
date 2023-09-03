

public class Main {

    public static void main(String[] args) {
        Triangle t=new Triangle(2,5,4);
        System.out.println(t.getArea());
        Recongnizer rec=new Recongnizer();
        rec.printNameOfShape(t);
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle.getArea());
        rec.printNameOfShape(rectangle);
        Shape[] shapes = new Shape[]{
                new Triangle(5, 4, 2),
                new Rectangle(9, 6),
                new Trapezium(5, 7, 9),
                new Circle(10),
                new Quad(2)
        };
        String shapeWithHighestArea = findHighestArea(shapes);

        System.out.println("Shape with highest area: " + shapeWithHighestArea);

    }
    public  static String findHighestArea(Shape[] shapes) {
        if (shapes.length == 0) {
            return null;
        }

        Shape maxShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].compareTo(maxShape) > 0) {
                maxShape = shapes[i];
            }
        }
        String max = String.valueOf(maxShape.getArea());

        return maxShape.getClass().getName().toString() +" - "+ max;
    }
}