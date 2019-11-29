package main;

import java.util.HashMap;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {

        System.out.println(returnUniqueCharacter("leetcode"));
    }

    private static int returnUniqueCharacter(String s){
        int index = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(!map.containsKey(current)){
                map.put(current, i);
            }else{
                map.put(current, -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for(char c: map.keySet()){
            if(map.get(c) > -1 && map.get(c) < min){
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
