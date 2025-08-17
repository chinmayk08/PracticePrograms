package prctice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Countduplicatecharacter {

            public static void main(String[] args) {
                String str = "automation";
                Map<Character, Integer> map = new LinkedHashMap<>();
                for (char c : str.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
    }

