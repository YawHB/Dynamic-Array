import java.util.Arrays;

public class DynamicArray {

    private int size = 0;
    private int growSize = 5;
    private Person[] array = new Person[10];


    public void add(Person person) {
        if(array.length == getSize()) {
            grow();
        }
        System.out.println("getSize " + getSize());
        System.out.println("array length " +  array.length);
        array[getSize()] = person;
       setSize(getSize()+1);

    }

    public int remove(){
        if(getSize() > 0) {
        array[getSize()-1] = null;
        System.out.println("One element removed");
        return setSize(getSize()-1);
        }
        System.out.println("The array is empty");
        return -1;
    }


    public  void remove(int index) {
        Person personToRemove = array[index];

        for(int i = 0; i < array.length; i++) {
            if(array[i] == personToRemove) {

                for(int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                setSize(getSize()-1);
            }
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
    public int getLength() {
        return array.length;
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


        for(int i = 0; i < array.length; i++) {

            newArray[i] = array[i];

        }
        array = newArray;
        System.out.println((array.length));
            return array;

    }



    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                "\nsize " + size +
                '}';
    }
}
