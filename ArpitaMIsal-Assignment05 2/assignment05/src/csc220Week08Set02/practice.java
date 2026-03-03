package csc220Week08Set02;
import java.util.Locale;
import java.util.Scanner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class practice {
    public static void main(String[] args){
        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key-1", "Entry-1");
        map.put("key-2", "Entry-2");
        map.put("key-3", "Entry-3");
        map.put("key-4", "Entry-4");
        map.put("key-5", "Entry-5");

        for (String key: map.keySet()) {
            System.out.println(key);
        }
        for(String value: map.values()) {
            System.out.println(value);
        }
    }

}
