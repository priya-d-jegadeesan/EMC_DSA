package BasicPrograms;

import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {
        
        String s = "Priyaa";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    
}
