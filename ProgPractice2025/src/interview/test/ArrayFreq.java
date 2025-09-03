package interview.test;

import java.util.HashSet;
import java.util.Set;

public class ArrayFreq {
    public static void main(String[] args) {
        int [] a = {1,3,5,6,7,3,5,3,1}; // o/p - 7
        Set set = new HashSet();
        int max = 0;
        int maxLength = 0; int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(!set.add(a[i])) {
                max = max+1;
                index = i;
            } else {
                set.add(a[i]);
            }
            maxLength = Math.max(maxLength, max);
        }
        System.out.println(index);

    }
}
