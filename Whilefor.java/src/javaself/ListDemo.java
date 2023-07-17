package javaself;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList grocery = new ArrayList();
		grocery.add("shampoo");
		grocery.add("soap");
		grocery.add("toothopaste");
		grocery.add("toothbrush");
		System.out.println(grocery);
		
		ArrayList veg = new  ArrayList();
		veg.add("tomoto");
		veg.add("brinial");
		veg.add("banana");
		System.out.println(veg);
		grocery.addAll(veg);
	
		

	}

}
