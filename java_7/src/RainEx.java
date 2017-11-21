import java.util.*;
public class RainEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in); 
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int rain = scanner.nextInt();
			v.add(rain); 
			if(v.equals("0")) {
				break;}
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
		}
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		int len = v.size();
			int avg = sum/len;
			System.out.println(" \n현재 평균 " + avg);
		}
		scanner.close();
	}
}