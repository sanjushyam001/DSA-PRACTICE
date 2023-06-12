package com.love.dsa.stack.interview;
import java.util.*;
public class IsValidParenthises {

	private static boolean isValid(String expression) {
		Stack<Character> stack=new Stack();
		for(int i=0;i<expression.length();i++) {
			
			char ch=expression.charAt(i);
			//if opening bracket ,stack push
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
			}else {
				if(!stack.isEmpty()) {
					char peek=stack.peek();
					if( (peek=='('&&ch==')') || (peek=='{'&&ch=='}') || (peek=='['&&ch==']')) 
					{
						stack.pop();
					}
					else{
						return false;
					}
				}
				else {
					return false;
				}
			}
		}//loop ends here .. 
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		String expression="[{()}]";
		boolean result = isValid(expression);
		if(result) {
			System.out.println(" Valid !");
		}else {
			System.out.println(" Invalid !");
		}
	}

}
