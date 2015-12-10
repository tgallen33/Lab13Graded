import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class Lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		int c = 0;
		int value;
		char first;
		Vector vector = new Vector();
		  int d = 10;
		  Object obj = vector.add(a);
		  
		try {
		    c = a / b;
		} catch (ArithmeticException aex) {
		    System.out.println(aex.toString());
		  }
		
		
		try {
		   int array[] = { 6, 16, 26,36,46,56,66,76 };
		   int index = 8;
		   value = array[ index ];
		}
		    catch( ArrayIndexOutOfBoundsException e ) { 
		    System.out.println(e.toString());
		    }
		
		
		try {
            FileReader reader = new FileReader("someFile");
            int i=0;
            while(i != -1){
                i = reader.read();
                System.out.println((char) i );
            }
            reader.close();
            System.out.println("--- File End ---");
        } catch (FileNotFoundException e) {
        	System.out.println(e.toString());
        } catch (IOException i) {
        	System.out.println(i.toString());
        }


		
		try{
			String word = new String("Java");
			System.out.println( word.charAt( 4 ) );
		}catch (StringIndexOutOfBoundsException e) {
			 System.out.println(e.toString());
			 }

		 try{
		    String s = "saurabh";
		    int i = Integer.parseInt(s);
		    System.out.println("int value = " + i);
		} catch (NumberFormatException nfe){
			System.out.println(nfe.toString());
		}
	

	
	  try {
	  String e = (String)obj;
	  vector.add(e);
	  } catch (ClassCastException e) {
		  System.out.println(e.toString());
	    }
	  
	  
	  try {
		    throw (new NoogieException());
		} catch (NoogieException ex) {
		    System.out.println(ex.toString());
		}
	  
	  
	  try {
		    int numCats = 0;
			String message = "CoogieException: " + numCats  + " is too many cats!";
			throw (new CoogieException(a,message));
		} catch (CoogieException ex) {
		    System.out.println(ex.getMessage());
		}
	  
	  
	 
	  
	  
	}
}
