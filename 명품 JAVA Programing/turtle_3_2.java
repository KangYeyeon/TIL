import java.io.File;

public class turtle_3_2 {
	public static void main(String[] args) {

		File f1 = new File("c:\\Temp\\test.txt");
		
		f1.delete();
		
		System.out.println("파일을 삭제했습니다.");
		
	}
}
