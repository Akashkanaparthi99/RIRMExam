package com.rirm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {
	
	public static boolean validateMobileNumber(String st) {
		Pattern pattern = Pattern.compile("^(?:\\(?([0-9]{3})\\)?[-. ]?)?([0-9]{3})[-. ]?([0-9]{4})$");
		Matcher match = pattern.matcher(st);
		return (match.find()&&match.group().equals(st));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String n = sc.nextLine();
		if (validateMobileNumber(n)) {
			System.out.println("Valid Number");
		}
		else {
			System.out.println("Not Valid Number");
		}
		
	}

}

/*
 * 2124567890
● 212-456-7890			
● (212)456-7890
● (212)-456-7890
● 212.456.7890 			
● 212 456 7890
● +12124567890
● +12124567890
● +1 212.456.7890
● +212-456-7890
● 1-212-456-7890
 */
