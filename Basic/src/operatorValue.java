import java.util.Scanner;

public class operatorValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        String c = sc.next();

        if(c.equals("+")){
            System.out.println(first+second);
        }else if(c.equals("-")){
            System.out.println(first-second);
        }else if(c.equals("*")){
            System.out.println(first*second);
        }else{
            System.out.println(first/second);
        }
    }
}
