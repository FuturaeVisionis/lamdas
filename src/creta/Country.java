package creta;

/**
 * Created by ronald on 21/10/16.
 */
public class Country {

    public class Province {

        // accessing the inner class via a method.

        PostalCode postal = new PostalCode(); // creating the object PostalCode
        /*
        Check this out! Page 398 of Head first Java. How to reach Inner classes.
        All the classes below are inner classes of each other.

        Why inner classes?
        Nested classes enable you to logically group classes that are only used in
        one place, increase the use of encapsulation, and create a more readable and
        maintainable code. Local classes, anonymous classes, and lambda expressions
        also import these advantages, however, the are intended to be use for more
        specific situations.

        www.tutorialspoint.com/java/java_innerclasses.htm

         */

        public void district(String code) {
            System.out.println("We all live in " + code + " province.");
            postal.postCode(2285, "VC");


        }

        private class PostalCode {
            void postCode(int numbers, String zipcode) {
                System.out.println("My postal code is " + numbers + zipcode);

                Town town = new Town();
                town.subdistrict("Rijswijk.");

            }

            class Town {

                Population population = new Population(); // create the object.

                String subdistrict(String sub) {
                    population.pop(999); // revering to the object.

                    System.out.print("Our sub district is " + sub);
                    return sub;

                }
                class Population{
                    void pop (int ammount){
                        System.out.println("Our town has " + ammount + " inhabitants.");
                    }
                }
            }
        }
    }
}














