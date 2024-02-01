public class Main {


    public static void main(String[] args) {
        Person harry = new Person("Harry Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person yaw  = new Person("Yaw");
        Person chris  = new Person("Chris");
        Person bo  = new Person("Bo");


        DynamicArray darr = new DynamicArray();


        darr.add(harry);
        darr.add(ron);
        darr.add(hermione);
        darr.add(yaw);
        darr.add(bo);darr.add(harry);
        darr.add(ron);
        darr.add(hermione);
        darr.add(yaw);
        darr.add(bo);
        System.out.println(darr);
        darr.grow();
        darr.add(chris);
        System.out.println(darr);




    }



}
