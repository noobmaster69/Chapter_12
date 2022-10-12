package Chapter1_Bags;

public interface BagInterface<T> {


    /**
     * Gets the current number of entries in this bag
     * @return The integer number of entries currently in the bag
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is empty
     * @return True if the bag is empty, or false if not
     */
    public boolean isEmpty();

    /**
     * Adds a new entry to this bag
     * @param newEntry The object to be added as a new entry
     * @return True if the addition is successful, or false if not
     */
    public boolean add(T newEntry);

    /**
     * Removes one specified entry from this bag, if possible
     * @return Either the removed entry, if the removal was successful, or null
     */
    public T remove();

    /**
     * Removes one ocurrence of a given entry from this bag, if possible
     * @param anEntry The entry to be removed
     * @return Truue if the removal was successful, or false if not
     */
    public boolean remove(T anEntry);

    /**
     * Removes all entreis from this bag
     */
    public void clear();

    /**
     * Counts the number of times a given entry appears in this bag
     * @param anEntry The entry to be counted
     * @return The number of times anEntry appears in the bag
     */
    public int getFrequencyOf(T anEntry);

    /**
     * Tests whether this bag contains a given entry
     * @param anEntry The entry to find
     * @return True if the bag contains anEntry, or false if not
     */
    public boolean contains(T anEntry);

    /**
     *
     * @return
     */
    public T[] toArray();

}
