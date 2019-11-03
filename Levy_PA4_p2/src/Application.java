import java.io.IOException;

public class Application {

	public static void main(String[] args) throws Exception  {
		DuplicateCounter DuplicateCounterObject = new DuplicateCounter();
		DuplicateCounterObject.count("problem2.txt");
		
		
		//DuplicateCounterObject.write("unique_words.txt" , uniques);
	}

}
