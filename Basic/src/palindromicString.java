import java.util.Scanner;
public class palindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //Inserting
        StringBuilder s2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            s2.append(s.charAt(i));
        }
        //Checking
        if (s2.toString().equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }
    }
}
