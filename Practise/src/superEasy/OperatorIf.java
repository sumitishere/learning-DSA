package superEasy;

import java.util.Scanner;

public class OperatorIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = sc.next();

        if(s=='+'){
            System.out.println(a+b);
        }else if(s.equals('-')){
            System.out.println(a-b);
        }else if(s.equals('/')){
            System.out.println(a/b);
        }else{
            System.out.println(a*b);
        }
    }
}
