package javabook.examples.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The usage of group() in regex library.
 * 
 * @author Owen
 *
 */
public class Groups {
	
	/*
	 * A part of one poem as the tested text.
	 */
	static public final String POEM = 
			"Twas brilling, and the slithy toves\n" +
			"Did gyre and gimble in the wabe.\n";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
				.matcher(POEM);
		while(m.find()) {
			for (int j = 0; j <= m.groupCount(); j++)
				System.out.print("[" + m.group(j) + "]");
			System.out.println();
			}
		}

}
