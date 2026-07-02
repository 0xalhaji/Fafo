/**
 * Insert element at a specified position
 *
 * @param employees Array of integer
 * @param position Location to insert new element
 * @param id Element to insert
 *
 * @return A new array on success otherwise null
 *
 */

public class InsertElement
{
    public static int[] insertEmployee(int[] employees, int position, int id)
    {
        if (employees == null || position < 0 || id < 0)
        {
            return null;
        }

        int[] arr = new int[employees.length + 1];

        for (int i = 0; i < position; i++)
        {
            arr[i] = employees[i];
        }

        arr[position] = id;

        for (int i = position; i < employees.length; i++)
        {
            arr[i + 1] = employees[i];
        }
        return arr;
    }
}
