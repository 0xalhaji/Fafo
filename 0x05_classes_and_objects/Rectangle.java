public class Rectangle
{
    private double width;
    private double height;

    /**
     * Creates a rectangle with the specified dimensions
     *
     * @param width the rectangle's width
     * @param height the rectangle's height
     *
     */
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the rectangle's area
     *
     */

    public double getArea()
    {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     * @return the rectangle's perimeter
     */

    public double getPerimeter()
    {
        return 2 * (height + width);
    }

    /**
     * Determines whether the rectangle is a square
     *
     * @return true if width and height are equal
     */
    public boolean isSquare()
    {
        return height == width;
    }
}
