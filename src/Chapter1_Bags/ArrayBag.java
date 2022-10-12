package Chapter1_Bags;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ArrayBag <T> implements BagInterface<T>{
    private final T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    /**
     * Task:Create an empty bag having a given capacity
     * @param capacity The integer capacity
     */
    public ArrayBag(int capacity){
        numberOfEntries = 0;
        //safe cast because new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Objects[capacity];
        bag = tempBag;


    }

    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    private boolean isArrayFull(){
        return numberOfEntries == bag.length;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }


    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        boolean result = true;
        if(isArrayFull()){
            result = false;
        }
        else {
            //assertion: result is true here
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    @Override
    public T remove() {
        T result = null;
        if(!isEmpty()){
            result = bag[numberOfEntries-1];
            bag[numberOfEntries-1] = null;
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
       boolean wasFound = false;
       int index = 0;
       while (!wasFound && (index < numberOfEntries)){
           if(anEntry.equals(bag[index])){
               wasFound = true;
               bag[index] = bag[numberOfEntries-1];
               bag[numberOfEntries-1] = null;
               numberOfEntries--;
           }
           else
               index++;
       }
       return wasFound;
    }

    @Override
    public void clear() {
        while (!isEmpty())
            remove();
    }

    @Override
    public int getFrequencyOf(T anEntry) {
       int counter = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if(anEntry.equals(bag[i])){
                counter++;
            }

        }
        return counter;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean wasFound = false;
        int index = 0;
        while (!wasFound && (index < numberOfEntries)){
            if (anEntry.equals(bag[index])){
                wasFound = true;
            }
            else
                index++;
        }
        return wasFound;
    }

    @Override
    public T[] toArray() {
        int capacity = 0;
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[capacity];

        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];

        }
        return result;
    }
}
