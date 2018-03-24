import java.io.FileWriter;  
public class Javafilewrite 
{  
    	public static void main(String args[])
	{    
         	try
		{    
           		FileWriter fw=new FileWriter("testout.txt");    
           		fw.write("Welcome to java file writing.");    
           		fw.close();    
          	}
		catch(Exception e)
		{
			System.out.println(e);
		}    
          	System.out.println("Success...");    
     	}    
}  
