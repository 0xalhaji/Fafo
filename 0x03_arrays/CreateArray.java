/**
 * Creates an integer array
 *
 * @param size: Size of the array
 * @param defaultStock: Integer value to be assigned to all index
 *
 * @return null if size < 0 empty array if size is exactly 0 otherwise an array id integer
 *
 */

public class CreateArray
{
    public static int[] CreateInventory(int size, int defaultStock)
    {
        if (size < 0)
        {
            return null;
        }
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = defaultStock;
        }
        return arr;
    }
}
