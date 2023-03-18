import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

//    Build a multiplication table system.

    //   At first, it should be possible to just see the results of one number up till a fix number (12 times for instance)
// - screenshot 1
//   Once you perfect that, it should be possible to give the number to multiply and how many times you want to see
// it multiplied eg: If i enter 2 and 24; it means i want to see the table of multiples of 2 up to 24 times
//   Once you get that part done, try to generate a fixed / manual table containing a range of numbers
// and their multiple like screenshot 2.
//   If you are able to pull the table above off, make it possible for users to tell the range of numbers they want
// to generate for e.g: start: 23; stop: 32; and how many multiples they want to create.
//   Use the user input to generate the table automatically based on the data provided.
    public static void main(String[] args) {
    /*MultiplicationTable table1 = new MultiplicationTable(5, 12);
    ArrayList<String> list1 = table1.multiply();
    for (String current : list1) {
        System.out.println(current);
    }
    */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = scanner.nextInt();
//        System.out.print("Enter the limit: ");
//        int limit = scanner.nextInt();
//        MultiplicationTable table1 = new MultiplicationTable(number, limit);
//        ArrayList<String> list1 = table1.multiply();
//        for (String current : list1) {
//            System.out.println(current);
//        }
        int startNumber = 2, endNumber = 5, limit = 3;
        System.out.print("   /");
        for (int i = 1; i <= limit; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.printf("%4d", i);

            for (int j = 1; j <= limit; j++) {
                int result = i*j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }


}
