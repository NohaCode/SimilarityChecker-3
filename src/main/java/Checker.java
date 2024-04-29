public class Checker {
    public Checker() {
    }

    public int lengthCheck(String str1, String str2) {
        if(str1.length() == str2.length()) return 60;
        else if(str1.length() >= 2*str2.length() || 2*str1.length() <= 2*str2.length()){
            return 0;
        }
        return 30;
    }
}
