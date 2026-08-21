public class PhoneBook
{
    private Contact[] contacts;
    private int contactCount;

    /**
     * Creates an empty phone book.
     *
     * @param capacity maximum number of contacts
     */
    public PhoneBook(int capacity)
    {
        contacts = new Contact[capacity];
        contactCount = 0;
    }

    /**
     * Adds a contact if there is space.
     *
     * @param contact the contact to add
     */
    public void addContact(Contact contact)
    {
        for (int i = 0; i < contacts.length; i++)
        {
            if (contacts[i] == null)
            {
                contacts[i] = contact;
                contactCount++;
                return;
            }
        }
    }

    /**
     * Finds a contact by name.
     *
     * @param name the name to search for
     * @return the matching contact or null if not found
     */
    public Contact findContact(String name)
    {
        for (Contact contact : contacts)
        {
            if (contact != null && contact.getName().equals(name))
            {
                return contact;
            }
        }

        return null;
    }

    /**
     * Removes a contact by name.
     *
     * @param name the name of the contact to remove
     */
    public void removeContact(String name)
    {
        for (int i = 0; i < contacts.length; i++)
        {
            if (contacts[i] != null &&
                contacts[i].getName().equals(name))
            {
                // Shift remaining contacts to the left
                for (int j = i; j < contacts.length - 1; j++)
                {
                    contacts[j] = contacts[j + 1];
                }

                // Clear the last position
                contacts[contacts.length - 1] = null;

                // Update count
                contactCount--;

                return;
            }
        }
    }

    /**
     * Returns the number of stored contacts.
     *
     * @return the contact count
     */
    public int getContactCount()
    {
        return contactCount;
    }
}
