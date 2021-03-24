import java.io.*;  
import java.net.*;

public class MyClient {  
	public static void main(String[] args) {  
		try{
			//String str = "harshal";
			Socket s = new Socket("localhost",6666); 
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Connection established!");
			System.out.println("Requesting the server for text file..");
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			String received = br.readLine();
		    while(received!= null) {
		    	System.out.println(received);
		    }
			dout.flush();  
			dout.close();  
			s.close();   
		}
		catch(Exception e){System.out.println(e);}  
	}  
}  
