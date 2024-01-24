import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();

        System.out.println("Simple Interest is "+principal*rate*time);
    }
}
