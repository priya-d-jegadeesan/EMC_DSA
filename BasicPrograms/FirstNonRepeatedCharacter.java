package BasicPrograms;

import java.util.*;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String s = "programming";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char key : map.keySet()) {

            if (map.get(key) == 1) {
                System.out.println("first non repeated character is : " + key);
                break;
            }
        }
    }

}
