package com.hareesh.absolutejava.pct;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatching {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] strings = new String[num];
		in.nextLine();
		for(int i = 0;i<num;i++) {
			strings[i] = in.nextLine();
		}
		for(int i=0;i<strings.length;i++) {
			System.out.println(checkBracketMatching(strings[i]));
		}
	}

	private static boolean checkBracketMatching(String checkString) {
		Stack<Character> brackets = new Stack<Character>();
		for(int i=0;i<checkString.length();i++) {
			if(checkString.charAt(i) == '(') {
				brackets.push('(');
			}else if(checkString.charAt(i) == '{') {
				brackets.push('{');
			}else if(checkString.charAt(i) == '[') {
				brackets.push('[');
			}else if(checkString.charAt(i) == ')') {
				if(brackets.isEmpty()) {
					return false;
				}else {
					if(brackets.peek() == '(') {
						brackets.pop();
					}else {
						return false;
					}
				}
			}else if(checkString.charAt(i) == '}') {
				if(brackets.isEmpty()) {
					return false;
				}else {
					if(brackets.peek() == '{') {
						brackets.pop();
					}else {
						return false;
					}
				}
			}else if(checkString.charAt(i) == ']') {
				if(brackets.isEmpty()) {
					return false;
				}else {
					if(brackets.peek() == '[') {
						brackets.pop();
					}else {
						return false;
					}
				}
			}
		}
		return brackets.empty();
	}

}
