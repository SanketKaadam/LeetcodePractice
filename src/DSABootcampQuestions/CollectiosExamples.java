package DSABootcampQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class CollectiosExamples {
    public static void main(String[] args){
        Collection values = new ArrayList<>();
        values.add(10);
        System.out.println(values);

        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(20);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(2,1000);
        System.out.println(l.get(5));
        System.out.println(l);

        Set<Integer> s = new HashSet<>();
        s.add(100);
        s.add(200);
        s.add(100);
        s.add(300);
        s.add(400);
        System.out.println(s);
        // System.out.println(s.get(3); we can't get elements bcoz in set elements is randoms

        Map<Integer,String> m = new HashMap<>();
        m.put(1,"sanket");
        m.put(2,"Akshay");

        System.out.println(m);
    }
}
