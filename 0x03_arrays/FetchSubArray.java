/**
 * Fetch a sub array
 *
 * @param sales Array of integer
 * @param start Starting point
 * @param end Ending point
 *
 * @return A new array containing elemnets from start to end
 *
 */

public class FetchSubArray
{
    public static int[] extractRange(int[] sales, int start, int end)
    {
        if (sales == null || start < 0 || end > sales.length)
        {
            return null;
        }

        int[] arr = new int[end - start + 1];
        int j = 0;

        for (int i = start; i <= end; i++)
        {
            arr[j] = sales[i];
            j++;
        }
        return arr;
    }
}
