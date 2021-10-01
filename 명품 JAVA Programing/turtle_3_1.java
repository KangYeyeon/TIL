import java.io.File;

public class turtle_3_1 {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\Temp\\test.txt");
		
		if(f1.exists()) 
			System.out.println("exist");
		else 
			System.out.println("no");

	}
}

