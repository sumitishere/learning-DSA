import java.util.Date;

public class PrettyPrinting {
    public static void main(String[] args) {

        float a = 45.2323232321143f;
        // %is a placeholder, its a formatted string
        System.out.printf("Formatted Number is %.2f", a);
        System.out.println();
        System.out.printf("Pie value is : %.2f", Math.PI);
        System.out.println();
        // Order of placeholders and variables matters
        System.out.printf("Hello my name is %s and I am %s", "Sumit", "Cool");
    }
}
