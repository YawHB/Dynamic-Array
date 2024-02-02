import java.util.Arrays;

public class DynamicArray {

    private int size = 0;
    private int growSize = 5;

    private final int INITIAL_SIZE = 5;
    private Person[] array = new Person[INITIAL_SIZE];


    public void add(Person person) {
        if (array.length == getSize()) {
            grow();
        }
        array[getSize()] = person;
        setSize(getSize() + 1);

    }

    public void remove() {
        remove(size - 1);
    }


    public void remove(int index) {
        Person personToRemove = array[index];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == personToRemove) {

                if (index == array.length - 1) {
                    array[index] = null;
                } else {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                }
                setSize(getSize() - 1);
            }
        }


        if (canShrink()) {
            shrink();
            System.out.println("Shrinked");
        }
    }

    public Person[] clear() {
        array = new Person[0];
        setSize(0);
        return array;
    }

    public int getSize() {
        return size;
    }

    public void getLength() {
        System.out.println("Array is: " + array.length + " elements long");
        ;
    }

    public Person getPerson(int index) {
        return array[index];
    }

    public int setSize(int size) {
        this.size = size;
        return size;
    }

    public Person setPerson(int index, Person person) {
        return array[index] = person;
    }

    private Person[] grow() {
        int newSize = array.length + growSize;
        Person[] newArray = new Person[newSize];


        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];

        }
        array = newArray;
        System.out.println((array.length));
        return array;

    }

    public boolean canShrink() {

        return size <= array.length - INITIAL_SIZE;
    }

    public void shrink() {

        int newSize = array.length - INITIAL_SIZE;
        Person[] shorterArr = new Person[newSize];


        for (int i = 0; i < size; i++) {
            shorterArr[i] = array[i];
        }
        array = shorterArr;


    }


    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                "\nsize " + size +
                '}';
    }
}
