package interview.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>() ;
        list.add("Ram");
        list.add("Jim");
        list.add("Sita");
        list.add("Elyse") ;

        for(String str: list) {
            if(str.equals("Ram"))
                list.remove("Ram");
        }
        System.out.println(list.toString());



    }
}
