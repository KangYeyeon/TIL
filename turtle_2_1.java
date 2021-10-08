import  java.io.*;

public class turtle_2_1 {
	public static void main(String[] args) {
		byte b[] = {3, 5};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.dat");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.dat에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			
			return;
		}
		
		byte c[] = new byte[2];
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.dat");
			int n=0, d;
			while((d = fin.read()) != -1) {
				c[n] = (byte)d;
				n++;
			}
			
			System.out.println("c:\\Temp\\test.dat에서 읽은 배열을 출력합니다.");
			for(int i=0; i<c.length; i++)
				System.out.print(c[i] + " ");
			System.out.println();
			
			fin.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.dat에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}