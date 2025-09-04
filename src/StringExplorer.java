import java.util.Scanner;

public class StringExplorer
{
	public static void main(String[] args)
	{
      // Count down with a "T minus 5"
      for (int t = 5; t > 0; t--){
        System.out.println("T minus " + t);
      }
      // Declare and instantiate a Scanner
      Scanner s = new Scanner(System.in);
    
      // infinite loop 
      while (true) {
        System.out.print("meaning of life");
        String answer = s.nextLine();
        System.out.println("lol you thought " + answer + " was right");
        if (answer.equals("42")) break;
        if (answer == "42") break;
      }
          // take an input
    
          // repeat input + message
    
          // implement "equals" to stop with the word "stop"
          
      
      /*
      ---------------------------
          SAMPLE STUFF
      ---------------------------
      */
  		String sample = "The quick brown fox jumped over the lazy dog.";
  
      // Print the sample and add a blank line after
      System.out.println("OUR SAMPLE:");
      System.out.println(sample + "\n");
  		
      //  Demonstrate the length method.
  		int l = sample.length();

  		System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		int position = sample.indexOf(4);
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
      //  Demonstrate the toLowerCase method.
		  String lowerCase = sample.toLowerCase();
		  System.out.println ("sample.toLowerCase() = " + lowerCase);
		  System.out.println ("After toLowerCase(), sample = " + sample);
				
		  //  toUpperCase
        System.out.println(sample.toUpperCase());

      // lastIndexOf
      System.out.println("Last h: " + sample.lastIndexOf("h"));


      // substring
      System.out.println("SUBSTRING PRACTICE");
      System.out.println(sample.substring(0, sample.length()));
      
      
      // equals

	}
}
