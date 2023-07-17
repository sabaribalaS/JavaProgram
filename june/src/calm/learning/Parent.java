package calm.learning;

public class Parent {
  final int balance = 100000; 
  protected void receive()
  {
    Child ch = new Child(); 
    ch.develop_java_applications();
    ch.cook();
    ch.receive();
    
    System.out.println("Taking Care of Relatives");
  }

  void cook()
  {
    System.out.println("Cooking");
  }
  final void getMarried()
  {
      
  }
}