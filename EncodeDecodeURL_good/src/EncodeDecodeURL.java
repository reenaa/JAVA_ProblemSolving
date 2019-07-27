import java.util.*;
class EncodeDecURL{
	String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	HashMap<String, String> map = new HashMap<>();
	Random rand = new Random();
	String key = getRand();
	
	public String getRand(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<6; i++){
			sb.append(alphabet.charAt(rand.nextInt(62)));
		}
		return sb.toString();
	}
	public String Encode(String longurl){
		while(map.containsKey(key)){
			key = getRand();
		}
		map.put(key,longurl);
		return "http://tinyurl.com/" + key;
	}
	public String Decode(String shortURL){
		return map.get(shortURL.replace("http://tinyurl.com/",""));
	}
}
public class EncodeDecodeURL {
	public static void main(String[] args){
		EncodeDecURL encodeDecURL = new EncodeDecURL();
		String encodeStr = encodeDecURL.Encode("http://amazon.com/abc/designtinyurl");
		System.out.println(encodeStr);
		String decodeStr = encodeDecURL.Decode(encodeStr);
		System.out.println(decodeStr);
	}
}
