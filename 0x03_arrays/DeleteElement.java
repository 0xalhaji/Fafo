/**
 * Delete the element at a given position
 *
 * @param products Array of integers
 * @param index Given position
 *
 * @return new array on success otherwise null on error
 *
 */

public class DeleteElement
{
    public static int[] removeProduct(int[] products, int index)
    {
        if (products == null || index < 0 || index > products.length - 1)
        {
            return null;
        }

        int[] arr = new int[products.length - 1];
        int j = 0;

        for (int i = 0; i < products.length; i++)
        {
            if (i != index)
            {
                arr[j]  = products[i];
                j++;
            }
        }
        return arr;
    }
}
