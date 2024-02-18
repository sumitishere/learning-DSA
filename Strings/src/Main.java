public class Main {
    public static void main(String[] args) {
        // Strings are sequence of characters
        // "Sumit" is a character
        // to store a number 10
        int a = 10;
        // a reference variable a pointing to 10 10 in stack memory and a is in heap
        int[] arr = {2,3,4,5};

        String name = "Sumit Mukharjee";
        System.out.println(name);

        //Strings are immutable
        String b = "Sumit";
        System.out.println(b);

        //created a new object
        b = "Mukharjee";
        System.out.println(b);


    }
}