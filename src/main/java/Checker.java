public class Checker {
    public Checker() {
    }

    public int lengthCheck(String str1, String str2) {
        if(str1.length() == str2.length()) return 60;
        else if(isLengthTwice(str1, str2)){
            return 0;
        }
        return 30;
    }

    private static boolean isLengthTwice(String str1, String str2) {
        return str1.length() >= 2 * str2.length() || 2 * str1.length() <= 2 * str2.length();
    }
}
