/**
 * Reverse a string
 *
 * @param str: String type
 *
 * @return: reversed string or null on error
 *
 */

public class ReverseStr
{
    public String reverse(String str)
    {
        if (str == null)
        {
            return null;
        }

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}
