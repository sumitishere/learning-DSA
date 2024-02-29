import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // Converting char into UNICODE ASCII VALUE
        System.out.println('a' + 'b');

        // Concatenating the strings or its values
        System.out.println("a"+"b");

        // Casting it
        System.out.println('a'+3);
        System.out.println('a'+'3');

        // integer will be converted to Integer that will call toString()
        // this is same as after a few steps : "a" + "1"
        System.out.println("a"+1);

        // This also converts to Arrays.toString() - > [x,y...,z] -> Kunal[];
        System.out.println("Kunal" + new ArrayList<>());

        // Doesn't work
        System.out.println("Sumit" + new Integer(56));

        System.out.println(new Integer(56)+""+ new ArrayList<>());

        // In java operator overloading is now allowed but only string concatenation can be overloaded. It was a design decision by original java team they wanted to keep the language simple and avoid the potential for cofusion and errors that can come with operator overloading.
    }
}
