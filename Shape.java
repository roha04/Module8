public  class Shape implements Comparable<Shape>{
    @Override
    public String toString(){
        return "Shape: ";
    }
    public  double getArea(){return 0.0;};
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
