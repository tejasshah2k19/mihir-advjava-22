package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

	public static boolean isRequired(String s) {
		if (s == null || s.trim().length() == 0) {
			return false;
		}
		return true;
	}

	public static boolean isAlpha(String s) {
		Pattern p = Pattern.compile("[a-zA-Z]+");// pattern
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public static boolean isDigit(String s) {
		Pattern p = Pattern.compile("[0-9]+");// pattern
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public static boolean isEmail(String s) {
		Pattern p = Pattern.compile("^(.+)@(.+)$");// pattern
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public static void main(String[] args) {

//		System.out.println(Character.isAlphabetic('9'));
		isAlpha("aasdadasd");
	}

}
