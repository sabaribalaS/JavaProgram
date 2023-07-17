package com.learning12;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for (int i = 0; i < input.length(); i++) {
	          char c = input.charAt(i);
	          if (c>='a'&&c<='z') {
	        output+=c;
	      }
	          else if (c>='1'&&c<='9') {
	        int repeat = c-'0';
	         while (repeat>1) {
	            output+=input.charAt(i-1);
	            repeat--;
	          }
	      }
	        }
	        System.out.println(output);
	    } }
