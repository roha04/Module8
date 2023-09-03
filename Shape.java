public abstract class Shape implements Comparable<Shape>{
    @Override
    public String toString(){
        return "Shape: ";
    }
    public abstract double getArea();
    @Override
    public int compareTo(Shape other) {
        double thisArea = this.getArea();
        double otherArea = other.getArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }

}
