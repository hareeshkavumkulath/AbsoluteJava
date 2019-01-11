package com.hareesh.absolutejava.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringPatterns {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		//System.out.println(line.matches("this is text"));
		
		System.out.println(isValid(line));
	}
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)+@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
        System.out.println(emailRegex);
		
		String emailRegex2 = "^[a-zA-Z0-9_+&*-]" +
							"+(?:\\.[a-zA-Z0-9*+&-]+)" +
							"*@" +
							"(?:[a-zA-Z0-9]" +
							"\\.)" +
							"[a-zA-Z]{2,7}$";
		
		String emailRegex3 = "^[a-zA-Z0-9*_-+]+(?:\\.[a-zA-Z0-9*_-+])+@+(?:[a-zA-Z0-9*_-+]\\.)+[a-zA-Z] {2,7}$";
		System.out.println(emailRegex3);
		
		System.out.println(emailRegex3);
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

}
