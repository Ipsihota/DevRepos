package interview.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int []a = {0, 0, 0, 1, 0, 1, 1, 0};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0) {
                list.add(a[i]);
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                list.add(a[i]);
            }
        }
        System.out.print(list.stream().toList());
    }
}
