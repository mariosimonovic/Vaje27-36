package test;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner; 

class GetInputFromUser 
{ 
	
	
   

	public static void main(String args[]) 
    { 

    	ArrayList<Oseba> Seznam;
    	BufferedReader Scanner;
    	
        try (// Using Scanner for Getting Input from User 
		Scanner in = new Scanner(System.in)) {
			String s = in.nextLine(); 
			System.out.println("You entered string "+s); 

  
			String a = in.nextLine(); 
			System.out.println("You entered integer "+a); 
  
			int b = in.nextInt(); 
			System.out.println("You entered float "+b);
			
		} 
        catch(Exception e) {
			System.err.println("Napaka: " + e);
		}
        
        private static ArrayList<Oseba>Seznam;
        Seznam = new ArrayList<Oseba>();
		Seznam.add(new Oseba(null, null, 0));
		Seznam.addAll(s);
		for(int c=0; c<2; c++) {
			
		}
		
        
        
        
}




	} 
  
        