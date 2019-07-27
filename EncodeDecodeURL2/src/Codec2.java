import java.util.*;
public class Codec2 {

    String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    HashMap<String, String> map = new HashMap<>();
    int count = 1;

    public String getString() {
        int c = count;
        StringBuilder sb = new StringBuilder();
        while (c > 0) {
            c--;
            sb.append(chars.charAt(c % 62));
            c /= 62;
        }
        return sb.toString();
    }

    public String encode(String longUrl) {
        String key = getString();
        map.put(key, longUrl);
        count++;
        return "http://tinyurl.com/" + key;
        
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
    }
    public static void main(String[] args){
		String url = "http://amazon.com/abc/designtinyurl";
		Codec2 codec = new Codec2();
		String encodedString = codec.encode(url);
		System.out.println(encodedString);
		String decodedStr = codec.decode(encodedString);
		System.out.print(decodedStr);
}
}
