package creta;

/**
 * Created by ronald on 21/10/16.
 */
public interface Surname {

    void callSurname(String surname);

    class MyId {

        static void idNumber(int id) {
            System.out.println("My id number is NL" + id);
        }
        public static void address(String street){
            System.out.println("I live on " + street);
        }
    }
}
