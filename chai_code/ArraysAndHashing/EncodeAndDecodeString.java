
package chai_code.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {

    public static String encode(List<String> words) {
        String result = "";

        for (String word : words) {
            result = result + word.length() + "#" + word;
        }

        return result;
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int ptr = 0;

        while (ptr < str.length()) {
            int index = str.indexOf("#", ptr);

            int count = Integer.parseInt(
                str.substring(ptr, index)
            );

            String word = str.substring(
                index + 1,
                index + 1 + count
            );

            result.add(word);

            ptr = index + 1 + count;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> input = List.of(
            "hello world",
            "",
            "chai#code",
            "123456789012345"
        );

        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);

        System.out.println("Match: " + input.equals(decoded));
    }
}
