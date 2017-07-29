package pg_ex01_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class WordCount {
	private static String fileName = "word.txt";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new FileReader(fileName));
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		String line;
		while((line = br.readLine()) != null) {
			String[] words = line.split("[.,;:!?\"\\s]+");
			for(String s : words) {
				s = s.toLowerCase();
				if(!tm.containsKey(s)) {
					tm.put(s, 1);
				}else{
					tm.put(s, tm.get(s)+1);
				}
			}
		}
		for(String s : tm.keySet()) {
			System.out.println(s + ":" + tm.get(s));
		}
	}

}
