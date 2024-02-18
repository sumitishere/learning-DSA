public class Comparison {
    public static void main(String[] args) {
        String a = "Sumit";
        String b = "Sumit";
        String c = a;
        System.out.println(c==a);

        // Comparator checks if reference variables points to same object
        System.out.println(a == b);

        // equals() - method
        String name1 = new String("Thala for a Reason😍");
        String name2 = new String("Sumit  ");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.length());

        System.out.println(name1.charAt(4));
    }
}
