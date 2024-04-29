public class Checker {
    public Checker() {
    }

    public double lengthCheck(String str1, String str2) {

        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 == length2) return 60;
        else if (isLengthTwice(length1, length2)) {
            return 0;
        } else {
            return getSubPoint(length1, length2);
        }
    }

    private static long getSubPoint(int length1, int length2) {
        double A, B, gap = 0;
        if (length1 > length2) {
            A = length1;
            B = length2;
        } else {
            A = length2;
            B = length1;
        }
        gap = A - B;
        //System.out.println(Math.round(60 - 60 * gap / B));
        return Math.round(60 - 60 * gap / B);
    }

    private static boolean isLengthTwice(int length1, int length2) {
        return (length1 >= 2 * length2) || (2* length1 <= length2);
    }
}
