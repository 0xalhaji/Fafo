public class ShoppingCart
{
    private  Product[] products;
    private int itemCount;

    /**
     * Creates an empty shopping cart with the specified capacity.
     *
     * @param capacity the maximum number of products
     */
    public ShoppingCart(int capacity)
    {
        products = new Product[capacity];
    }

    /**
     * Adds a product to the cart if there is space.
     *
     * @param product the product to add
     */
    public void addProduct(Product product)
    {
        for (int i = 0; i < products.length; i++)
        {
            if (products[i] == null)
            {
                products[i] = product;
                return;
            }
        }
    }

    /**
     * Removes the first matching product from the cart.
     *
     * @param product the product to remove
     *
     */

    public void removeProduct(Product product)
    {
        for (int i = 0; i < products.length; i++)
        {
            if (products[i] == product)
            {
                products[i] = null;
                return;
            }
        }
    }
    /**
     * Calculates the total price of all prodducts.
     *
     * @return the total price
     */
    public double getTotal()
    {
        double total = 0;

        for (Product product : products)
        {
            if (product != null)
            {
                total += product.getPrice();
            }
        }
        return total;
    }

    /**
     * Returns the number of products currently in the cart.
     *
     * @returnthe number of products
     */

    public int getItemCount()
    {
        int count = 0;

        for (Product product : products)
        {
            if (product != null)
            {
                count++;
            }
        }
        return count;
    }
}
