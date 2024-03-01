package superEasy;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();

        float result = principal * rate * time;
        System.out.println(result);
    }
}
