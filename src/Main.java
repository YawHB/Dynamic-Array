public class Main {


    public static void main(String[] args) {
        Person harry = new Person("Harry ");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person yaw = new Person("Yaw");
        Person chris = new Person("Chris");
        Person bo = new Person("Bo");


        DynamicArray darr = new DynamicArray();

        /*System.out.println();
        System.out.println(darr);
        System.out.println("----------");
        darr.add(harry);
        System.out.println(darr);
        System.out.println("----------");*/

        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(harry);
        darr.add(bo);
        darr.add(chris);
        darr.add(ron);


        System.out.println(darr);
        System.out.println("===FJERN===");
        darr.remove();
        System.out.println(darr);






// kan min kode fjerne det sidste element i




    }


}
