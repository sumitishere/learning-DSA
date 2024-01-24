import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input currency in rupees ");
        int rupees = sc.nextInt();
        float dollars = rupees/84;
        System.out.println("Converted to dollar is $"+dollars);
    }
}
