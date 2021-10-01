import java.io.File;

public class turtle_3_3 {
	public static void main(String[] args) {

		File f1 = new File("c:\\Temp\\test.txt");
		
		if(f1.exists()) {
			long size = f1.length();
			System.out.println(size);
		}
		else
			System.out.println("파일이 존재하지 않습니다.");
	}
}
