import java.util.HashMap;
import java.util.Map;

public class Codec {
    Map<Integer, String> map = new HashMap<>();
    int i = 0;

    public String encode(String longUrl) {
        map.put(i, longUrl);
        return "http://tinyurl.com/" + i++;
    }

    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
    public static void main(String[] args){
    		String url = "http://amazon.com/abc/designtinyurl";
    		Codec codec = new Codec();
    		String encodedString = codec.encode(url);
    		System.out.println(encodedString);
    		String decodedStr = codec.decode(encodedString);
    		System.out.print(decodedStr);
    }
}


