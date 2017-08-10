package javabook.examples.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Test the regular expression
 * 
 * @author Owen
 *
 */
public class RegExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "abcabcabcdefabc";
		String pattern = "abc";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println("Match \"" +
					m.group() + "\" at positions " 
					+ m.start()+ "-" + (m.end()-1));
			
		}
	}

}
