/**
 * Find the sum of an array
 *
 * @param prices Array of items price
 *
 * @return Sum of array otherwise 0  if prices is empty
 *
 */

public class SumOfArray
{
    public static int totalPrice(int[] prices)
    {
        if (prices == null)
        {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < prices.length; i++)
        {
            sum += prices[i];
        }
        return sum;
    }
}
