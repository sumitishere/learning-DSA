public class searchInString {
    public static void main(String[] args) {
        String name = "Sumit";
        char target = 's';
        System.out.println(searchInString(target, name));

    }

    static boolean searchInString(char target, String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
