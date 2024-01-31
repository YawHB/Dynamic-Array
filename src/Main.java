public class Main {


    public static void main(String[] args) {
        Person harry = new Person("Harry Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person yaw  = new Person("Yaw");

        DynamicArray darr = new DynamicArray();


        darr.add(harry);
        darr.add(ron);
        darr.add(hermione);
        darr.add(yaw);
        System.out.println(darr);
        darr.remove(1);
        System.out.println(darr);
        darr.remove();
        System.out.println(darr);




    }



}
