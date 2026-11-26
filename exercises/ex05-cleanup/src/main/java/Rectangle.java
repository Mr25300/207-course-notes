public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    /**
     * calculates the area of the rectangle
     * @returns the calculated area
     */
    public double area() {
        return width * height;
    }

    /**
     * scales the rectangle
     * @param factor
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    /**
     * checks whether this rectangle is larger than another
     * @param other the rectangle being compared to
     * @returns a boolean representing whether this rectangle is larger than the other
     */
    public boolean isLargerThan(Rectangle other) {
        if (area() > other.area()) {
            return true;
        } else {
            return false;
        }
    }
}
