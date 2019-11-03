import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		String uniques = new String();
		
		DuplicateRemover DuplicateRemoverObject = new DuplicateRemover();
		uniques = DuplicateRemoverObject.remove("/Users/Daniel/Desktop/problem1.txt");
		
		
		DuplicateRemoverObject.write("/Users/Daniel/Desktop/unique_words.txt" , uniques);
		
		
		
		

	}
}