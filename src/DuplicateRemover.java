import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;



public class DuplicateRemover {
	public Scanner scan;
	
	
	
	
	public String remove(String dataFile) throws IOException {
		
		FileInputStream file = new FileInputStream(dataFile);
		scan = new Scanner(file);
		String uniqueWords = null;
		HashSet<String> uniqueWord = new HashSet<String>();
		
		while(scan.hasNextLine()){
			uniqueWord.add(scan.next());
		}
		
		String[] uniques = uniqueWord.toArray(new String[uniqueWord.size()]);		 
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(uniques) );
		String[] noDupes = linkedHashSet.toArray(new String[] {});
		System.out.printf(Arrays.toString(noDupes));
		scan.close();
		return Arrays.toString(noDupes);
		
		
		}
		public void write(String outputFile, String uniqueWords) throws IOException {
			 
			FileOutputStream outputStream = new FileOutputStream(outputFile);
			 byte[] writer = uniqueWords.getBytes();
			    outputStream.write(writer);
			   outputStream.close();
			   
			
				
		}
		
		
		
		
		
	
	
		
	}
	


