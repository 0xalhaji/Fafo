/**
 * Check if a string reads the same forward and backward
 *
 * @param str: String type
 *
 * @return: True if str is palindrome otherwise false
 *
 */

public class PalindromeString
{
    public boolean isPalindrome(String str)
    {
        if (str == null)
        {
            return false;
        }

        int end = str.length() - 1;
        int start = 0;

        while (start < end)
        {
            if (str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
