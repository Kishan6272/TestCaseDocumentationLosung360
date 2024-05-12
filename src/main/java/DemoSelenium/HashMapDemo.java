package DemoSelenium;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("key1","Dhoni");
        map.put(null,"MSD");
        map.put(null,"MSD2null");
        map.put("CSK",null);
        map.put("RCB",null);
//        System.out.println(map.size());
//        System.out.println(map);
        ArrayList<String> A=new ArrayList<>(Arrays.asList("Ramesh","Suresh","Mahesh","Kishan"));
        System.out.println(A);

    }

}
