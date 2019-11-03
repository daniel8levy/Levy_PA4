
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;




	
	
public class DuplicateCounter {
	private Map<String, Integer> wordCounter;

	
	public void count(String dataFile) throws IOException {
		FileInputStream file = new FileInputStream(dataFile);
		Scanner sc1 = new Scanner(file);
		HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
		
		
		
		
		while(sc1.hasNext()){
		  
		 String wordCount=sc1.next();
	      int numCount = wordCounter.get(wordCount);
	    if(numCount == 0) {
	    	  	numCount = 1;
		 System.out.print(wordCount);
		}
	      else
	    	  numCount = numCount + 1;
	       wordCounter.put(wordCount, numCount);
		
			
        }
		
		
			
		
			
		}
		
		
	
		
		
		
	}

