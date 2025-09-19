import java.util.Scanner;

public class Drills {
    
    public static void main(String[] args) {
    
        // Declare 5 different data types with initial values (include at least one array)
        int above85 = 0;
        ;
        char A = 'a';
        boolean yesOrNo = true;
        int[] testScores = {85, 92, 78, 95, 88, 73, 91};
        // A standard for loop printing numbers 1-5 with their squares
        for(int i = 0; i < 5; i++){
            System.out.println(testScores[i]);
        }
        // Create an int array with test scores: 85, 92, 78, 95, 88, 73, 91
        System.out.println("------------------");
        // Use a for-each loop to traverse and print each score
        for (int i = 0; i < testScores.length; i++){
            System.out.println(testScores[i]);
        }
        // Calculate and print the average of the test scores array
System.out.println("------------------");
        int total = 0;
        // a tidy one-liner 
        for(int num : testScores) total += num;     
        // ONLY PRINT THE RESULT !!AFTER!!! THE LOOP
        System.out.println("Average " + (total/testScores.length));


        System.out.println("------------------");
        // Count how many scores are above 85 using a loop
        for(int i = 0; i < testScores.length; i++){
            if (testScores[i]>85)  above85++;
           
        } 
        System.out.println("test scores above 85 : " + above85);
        // An infinite loop that collects user input
        System.out.println("------------------");

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("input value : ");
            int input = s.nextInt();
            // A short-circuit conditional with four tests
            // (check if input is: positive && less than 100 && even && divisible by 5)
            if(input > 0 && input < 100 && input % 2 == 0 && input % 5 == 0){
                System.out.println("Passed");
                // Break the loop if all conditions pass
                break;
            }
        }
        System.out.println("------------------");

       // Loop through each char in the String "DataScience"
        // Print each character on a separate line with its index
        String dataScience = "DataScience";
        for(int i = 0; i < dataScience.length(); i++ ){
            System.out.println(dataScience.charAt(i));
        }
                
        System.out.println("------------------");
 
                
        // Given String word = "Algorithm", print only the first three letters
        String algorithm = "Algorithm";
        System.out.println(algorithm.substring(0, 3));


        System.out.println("------------------");
        // Print all the odd numbers from 1-100 in rows of 10 numbers each
        int tenCount = 0;
        for( int i = 0 ; i < 100; i ++){
            if(i % 2 != 0) System.out.print(" " + i);
            tenCount++;
            if(tenCount == 20){
                tenCount = 0;
                System.out.println("");
            }

        }
        // Create a Scanner and take a String input (ask for user's name)
        Scanner a = new Scanner(System.in);
        System.out.print("insert name : ");
        // Create a Scanner, take a number, print a countdown from that number to 0
        // Format: "T-minus [number]..."
        
        // Create a double array for temperatures: {72.5, 68.3, 75.1, 69.8, 71.2}
        // Find and print the highest and lowest temperatures
        
    
    
    // Create a method that compares two arrays and returns the larger average
    // Include a proper JavaDoc comment
    
    // Create a method that formats a number as a percentage (returns String)
    // Include a proper JavaDoc comment
    }
}