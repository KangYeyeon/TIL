import java.io.*;

public class turtle_2_2 {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Windows\\system.ini");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 2048);
			while ((c = fin.read()) != -1) {
				out.write(c);
			}

			fin.close();
			out.close();
			
		} catch (IOException e) {
			System.out.println("실패");
		}
	}
}
