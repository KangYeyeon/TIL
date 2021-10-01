import java.io.File;

public class turtle_3_4 {
	public static void main(String[] args) {

		File f1 = new File("c:\\Temp\\test.txt");
		
		if(f1.exists()) {
			File f2 = new File("c:\\Temp\\res.txt");
			f1.renameTo(f2);
			System.out.println(f1.getPath() + "의 이름을 " + f2.getPath() + "로 변경했습니다.");
		}
		else
			System.out.println("파일이 존재하지 않습니다.");
	}
}
