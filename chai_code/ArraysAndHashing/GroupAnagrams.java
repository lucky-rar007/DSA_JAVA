package chai_code.ArraysAndHashing;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
public class GroupAnagrams {

    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }
    public static String sorted(String s) {
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main (String[] args) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
        for(int i=0;i<strs.length;i++){
            String key = sorted(strs[i]);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
    }
}
