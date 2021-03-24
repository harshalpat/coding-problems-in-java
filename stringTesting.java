package sample;

public class stringTesting {
		
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        String s = "abc"; 
	        printPermutn(s, ""); 
	    }
		  
	    // Function to print all the permutations of str 
	    public static void printPermutn(String str, String ans) 
	    { 
	  
	        // If string is empty 
	        if (str.length() == 0) { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	            // ith character of str 
	            char ch = str.charAt(i); 
	  
	            // Rest of the string after excluding  
	            // the ith character 
	            String s1 = str.substring(0, i);
	            String s2 = str.substring( i + 1);
	            String ros = str.substring(0, i) +  str.substring(i + 1); 
	  
	            // Recurvise call 
	            printPermutn(ros, ans + ch); 
	        } 
	    }

}
