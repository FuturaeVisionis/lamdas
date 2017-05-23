package beta;

/**
 * Created by ronald on 20/10/16.
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("=== Runnable Test ===");


        //Anonymous Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        runnable.run();

        //Lambda Runnable
        Runnable runnable1 = () -> System.out.println("Hello world two!");
        runnable1.run();

        //new Thread(new Runnable() {
            //@Override
            //public void run() {
                //System.out.println("I am legend!");
            //}
        //}).start();

        Runnable runnable2 = () -> System.out.println("I am Mickey Mouse!");
        runnable2.run();
    }
}