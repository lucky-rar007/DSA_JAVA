package chai_code.ArraysAndHashing;
import java.util.Arrays;

public class ValidAnagram {


    public boolean isAnagram(String s, String t){
            return sorted(s).equals(sorted(t));
        }

    public String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
    }

}
