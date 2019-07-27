import java.util.*;
public class ZigzagConversion {
	public static void main(String[] args){
		String s = "PAYPALISHIRING";
		int numrows = 3;
		String zingzagStr = convert(s,numrows);
		System.out.println("Zigzag output = "+zingzagStr);
	}
	public static String convert(String s, int numRows){
		if(numRows ==1)
			return s;
		List<StringBuilder> rows = new ArrayList<>();
		for(int i=0; i<Math.min(numRows, s.length()); i++){
			rows.add(new StringBuilder());
		}
		int currentRow = 0;
		boolean goingdown = false;
		for(char c: s.toCharArray()){
			rows.get(currentRow).append(c);
			if(currentRow ==0 ||currentRow == numRows-1)
				goingdown = !goingdown;
			if(goingdown)
				currentRow = currentRow + 1;
			else
				currentRow = currentRow - 1;
		}
		StringBuilder ret = new StringBuilder();
		for(StringBuilder row : rows){
			ret.append(row);
		}
		return ret.toString();
	}
}
