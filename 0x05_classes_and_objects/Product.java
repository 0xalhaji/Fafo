public class Product
{
    private String name;
    private double price;

    /**
     * Creates a product.
     *
     * @param name product name
     * @param price product price
     *
     */
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the product price.
     *
     * @return the price
     */
    public double getPrice()
    {
        return price;
    }
}
