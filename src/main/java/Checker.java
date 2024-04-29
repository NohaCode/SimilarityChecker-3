public class Checker {
    public Checker() {
    }

    public double lengthCheck(String str1, String str2) {
        if (str1.length() == str2.length()) return 60;
        else if (isLengthTwice(str1, str2)) {
            return 0;
        } else {
            double A, B, gap = 0;
            if (str1.length() > str2.length()) {
                A = str1.length();
                B = str2.length();
                gap = A - B;
            } else {
                A = str2.length();
                B = str1.length();
                gap = B - A;
            }
            //System.out.println(Math.round(60 - 60 * gap / B));
            return Math.round(60 - 60 * gap / B);
        }
    }

    private static boolean isLengthTwice(String str1, String str2) {
        return str1.length() >= 2 * str2.length() || 2 * str1.length() <= 2 * str2.length();
    }
}
