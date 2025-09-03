package interview.test;

public class ReverseStringDemo {
    public static void main(String[] args) {
//        String s1 = "My name is Basavaraj";
        String s1 = "My, name. is Basavaraj";
//        String reverse = reverseString(s1);
        String reverse = reverseString1(s1.toCharArray());
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

    private static String reverseString1(char[] charArray) {
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Find the next letter from the left
            while (left < right && !Character.isLetter(charArray[left])) {
                left++;
            }

            // Find the next letter from the right
            while (left < right && !Character.isLetter(charArray[right])) {
                right--;
            }

            // If both are letters, swap them
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }
}
