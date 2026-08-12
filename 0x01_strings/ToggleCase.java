public class ToggleCase
{
    /**
     * Converts string to array of char
     *
     * @param s the input string
     * @return a new string on success otherwise null
     *
     */
    public static char[] stringToChar(String s)
    {
        if (s == null)
        {
            return null;
        }
        char[] characters = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            characters[i] = s.charAt(i);
        }

        return characters;
    }
    /**
     * Toggles the case of every english letter in a string.
     *
     * @param s the input string
     * @return a new string with uppercase letters converted to
     *         lowercase and vice verse
     *
     */

    public static String toggleCase(String s)
    {
        if (s == null)
        {
            return null;
        }

        char[] c = stringToChar(s);
        String toggled = "";
        
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] >= 'a' && c[i] <= 'z')
            {
                toggled += (char)(c[i] - 32);
            }
            else if (c[i] >= 'A' && c[i] <= 'Z')
            {
                toggled += (char)(c[i] + 32);
            }
            else
            {
                toggled += c[i];
            }
        }
        return toggled;
    }
}
