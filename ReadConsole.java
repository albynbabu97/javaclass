import java.io.*;
public class ReadConsole 
{	
	InputStreamReader cin = null;
	public static void main(String args[]) throws IOException 
	{
		InputStreamReader cin = new InputStreamReader(System.in);
         	System.out.println("Enter characters, 'q' to quit.");
         	char c;
         	do 
		{
            		c = (char) cin.read();
            		System.out.print("\n"+c);
         	} while(c != 'q');
          	cin.close();
      }
}
