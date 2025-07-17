package interview.test;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String s1 = "My name is Basavaraj";
//        String s1 = "My, name. is Basavaraj";
        String reverse = reverseString(s1);
System.out.println("Reversing words: "+ reverse);

    }

    private static String reverseString(String s1) {
        String [] strArr= s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i--) {
            sb.append(strArr[i]).append(" ");
        }
        return sb.toString();
    }

    private static String reverseString1(String s1) {
        StringBuilder sb = new StringBuilder();
        char d1 = ',';
        char d2 = ' ';
        char d3 = '.';

        //char [] charr = s1.toCharArray();
////        String s11 = s1.splitWithDelimiters()
//        String s11 = s1.substring(0, s1.indexOf(d1));
//        String s12 = s1.substring(0, s1.indexOf(d1));
//        String s13 = s1.substring(0, s1.indexOf(d1));
char[] chars = s1.toCharArray();
        for (int i = chars.length-1; i > 0; i--) {
//            if(chars[i] == d1)
            if(chars[i]>=97  && chars[i]<123 || (chars[i]>=65  && chars[i]<91)) {
                sb.append(chars[i]);
            }

        }






        return sb.toString();
    }
}
