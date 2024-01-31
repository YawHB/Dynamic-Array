import java.util.Arrays;

public class DynamicArray {

    private int size = 0;
    private Person[] array = new Person[10];


    public void add(Person person) {
        array[getSize()] = person;
       setSize(getSize()+1);

    }

    public void remove(){
        array[getSize()-1] = null;
        setSize(getSize()-1);
    }
    public  void remove(int index) {
        Person personToRemove = array[index];
        System.out.println(personToRemove);

        for(int i = 0; i < array.length; i++) {

            if(array[i] == personToRemove) {

                for(int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                setSize(getSize()-1);


            }


        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                "\nsize " + size +
                '}';
    }
}
