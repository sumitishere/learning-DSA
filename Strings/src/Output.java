import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(45);
        System.out.println("Sumit");

        // this returns textual representaion of object
        // System.out.println(new int[]{1,2,3,4,5}); //prints some random value

        System.out.println(Arrays.toString(new int[]{1,2,3,4}));

        String name = null;
        System.out.println(name);
    }
}
