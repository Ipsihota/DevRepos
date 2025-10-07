package interview.test;

import java.util.*;

public class OccranceDemo {
    public static void main(String[] args) {
        int []array = {1,1,2,3,4,5,5,7};
        int k = 5;

        Set<Integer> s = new HashSet<>();
        int foc=0;
        int loc=0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == k){
                if(!s.contains(array[i])) {
                    foc = i;
                    s.add(array[i]);
                    found = true;
                } else {
                    if(s.contains(array[i])) {
                        loc = i;
                    }
                    else {loc = foc;}
                }
            }
        }

        if(found) {
            System.out.println("foc: " + foc + " loc: " + loc);
        } else {
            System.out.println("Key not found!");
        }

    }

}
