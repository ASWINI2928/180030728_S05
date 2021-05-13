package session6;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("hi");
         try {
         int a=6/0;//exception object
         }
         catch(NullPointerException ne) {
        	 System.out.println(ne);
         }
         catch(ArithmeticException e1) {
        	 System.out.println(e1);
         }
         catch(Exception e) {
        	 System.out.println(e);
         }
         System.out.println("hello");
	}

}
