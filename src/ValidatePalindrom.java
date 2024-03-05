public class ValidatePalindrom {
    public static void main(String[] args) {
        ValidatePalindrom val = new ValidatePalindrom();
        System.out.println("Result:" + val.isPalindrome("\"A man, a plan, a canal: Panama\""));
    }

    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = s1.length();
        int i = 0;
        int j = length - 1;
        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}