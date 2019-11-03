import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicate_Remover2 {
public Scanner scan;
	
	
	
	
	public String remove(String dataFile) throws IOException {
		
		FileInputStream file = new FileInputStream(dataFile);
		scan = new Scanner(file);
		HashSet<String> uniqueWords = new HashSet<String>();
		String uniques;
		
		while (scan.hasNext()) {
			uniques = scan.nextLine();
			
			uniqueWords.add(uniques);
		}
			
		String[] uniques = ((String) uniqueWords).split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(uniques) );
		String[] noDupes = linkedHashSet.toArray(new String[] {});
		System.out.printf(Arrays.toString(noDupes), uniqueWords);
		return Arrays.toString(noDupes);
		
		
		}
		public void outputFiles(String outputFile, String uniqueWords) throws IOException {
			 
			FileOutputStream outputStream = new FileOutputStream(outputFile);
			 byte[] writer = uniqueWords.getBytes();
			    outputStream.write(writer);
			 
				
		}
		
		
		
		
		
	
	
		
	}
	



}
