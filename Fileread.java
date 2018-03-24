import java.io.FileReader;  
public class Fileread 
{  
    	public static void main(String args[]) throws Exception
	{    
          	FileReader fr=new FileReader("testout.txt");    
          	int i;    
          	while((i=fr.read())!=-1)    
          		System.out.print((char)i); 
		System.out.println("\n");   
          	fr.close();    
    	}    
}  
