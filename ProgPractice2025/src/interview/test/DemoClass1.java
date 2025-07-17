package interview.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoClass1 {
    public static void main(String[] args) {
//     System.out.println(reverseInt(123));

        Integer a[] = {12, 5, 6, 4};// 1 - 12

        ArrayList<Integer> integerList = new ArrayList<Integer>(Arrays.asList(a));

        for (int i = 1; i <=12; i++) {
          if(!integerList.contains(i)) {
             System.out.print(i + " ");
          }
        }

    }

    public static int reverseInt(int num) {
        int revInt = 0;
        while(num > 0) {
            int r = num % 10;
            revInt = revInt*10+r;
            num = num/10;
        }
        return revInt;
    }
}
