package wordList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Word {
	
	public static void main(String[] args) {
		File file=new File("birthday.txt"); // creating the file, you can change the name of the file
		FileWriter fw;
		try{
			fw= new FileWriter(file);
			
			//__________________________________________________________________
			// here you can change what should your text file contains
			for(int i=1950;i<=2020;i++)
			  for(int j=1;j<=12;j++)
				  for(int k=1;k<=31;k++)
				fw.write(i+""+(j<10 ? "0"+j :j )+""+(k<10 ? "0"+k :k )+"\n");
			for(int i=1900;i<=2020;i++)
				  for(int j=1;j<=12;j++)
					  for(int k=1;k<=31;k++)
					fw.write((k<10 ? "0"+k :k )+""+(j<10 ? "0"+j :j )+""+i+"\n");
			//_________________________________________________________________
			
			
			fw.close(); 
		}catch(IOException e){}
	}

}
