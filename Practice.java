import java.util.*;

public class Practice {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			Integer n = scanner.nextInt();
			if (n==-1) break;
			v.add(n);
		}
		
		int max = 0;
		for(int i=0; i<v.size(); i++) {
			if (v.get(max) < v.get(i)) {
				max = i;
			}
		}
		
		System.out.print("가장 큰 수는 " + v.get(max));
		scanner.close();
	}
}


