package PrecourseDS;

public interface NameInterface {

    /**
     * Sets the first and last names
     * @param firstName A string that is the desired first name
     * @param lastName A string that is the desired last name
     */
    public void setName(String firstName, String lastName);


    public String getName();


    public void setFirst(String firstName);

    public String getFirst();

    public void setLast(String lastName);
    public String getLast();

    public void giveLastNameTo(NameInterface aName);

    public String toString();
}
