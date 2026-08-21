public class Contact
{
    private String name;
    private String phoneNumber;

    /**
     * Creates a contact.
     *
     * @param name the contact's name
     * @param phoneNumber the contact's phone number
     *
     */

    public Contact(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the contact's name.
     *
     * @return the name
     */

    public String getName()
    {
        return name;
    }

    /**
     * Returns the contact's phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
