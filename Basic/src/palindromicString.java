import java.util.Scanner;

public class palindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        if (s2.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }
    }
}
