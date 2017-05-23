package creta;


/**
 * Created by ronald on 20/10/16.
 */
public class NameExample {

    public static void main(String[] args) {

        //Names names = new Names() {
        //@Override
        //public void sayName(String name) {
        //System.out.println("My name is: " + name);
        //}
        //};
        //names.sayName("John");

        Names names2 = (s) -> System.out.println("My name is: " + s);
        names2.sayName("Gerard");

        Surname surname = (s) -> System.out.println("My surname is: " + s);
        surname.callSurname("Kneppers");

        Surname surname1 = (s) -> System.out.print(s);
        Surname.MyId.idNumber(89548671);
        Surname.MyId.address("Elm Street");

        Country country = new Country();
        Country.Province myProvince = country.new Province() {
        };
        myProvince.district("Gauteng");

    }
}


