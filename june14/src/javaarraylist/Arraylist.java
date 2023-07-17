package javaarraylist;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList(); 
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40); 
		  
		  ArrayList b = new ArrayList(); 
		  b.add(50);
		  b.add(60);
		  b.add(70);
		  b.add(80); 
		  
		  a.addAll(b);
		  System.out.println(a);
		  a.retainAll(b);
		  System.out.println(a);
		List c = a.subList(0, 2);
		  System.out.println(c);
		ArrayList al = new ArrayList(); 
		  al.add(10);
		  al.add(true);
		  al.add(30);
		  al.add("Yogesh Balaji"); 
		  
		  ArrayList bk = new ArrayList(); 
		  bk.add(50);
		  bk.add(06.3f);
		  bk.add(false);
		  bk.add(80.5); 
		  
		  a.addAll(b);
		  System.out.println(a);
		  //  [10, 20, 30, 40, 50, 60, 70, 80]
		  a.retainAll(b);
		//  [50, 60, 70, 80]
		  System.out.println(a);
		  List cj = a.subList(0, 2);
		  System.out.println(cj);
		  
		  Object[] ob = a.toArray(); 
		  for(Object val:ob)
		  {
		    System.out.println(val);
		  }}}