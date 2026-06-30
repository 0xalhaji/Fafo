/**
 * Search for an element
 *
 * @param ids Array of integer type
 * @param target Element to look for
 *
 * @return -1 if element not found otherwise return the first index of target
 *
 */

public class SearchForElement
{
    public static int findCustomer(int[] ids, int target)
    {
        for (int i = 0; i < ids.length; i++)
        {
            if (ids[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
