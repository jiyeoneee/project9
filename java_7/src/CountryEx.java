import java.util.*;
public class CountryEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 10개 입력하시오.(예 : Korea 5000)");
		while(true) { //나라이름과 인구를 저장
			System.out.print("나라 이름, 인구 >>");
			String nation = scanner.next();
			if(nation.equals("그만")) //그만이 입력될때까지 반복
				break;
			int population = scanner.nextInt();
			nations.put(nation, population); // 해시맵에 나라이름과 인구를 저장
		}
		while(true) { //검색
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) //그만이 입력될때까지 반복
				break;
			Integer a = nations.get(nation);  
			if(a == null)
				System.out.println(nation + " 나라는 없습니다.");
			else 
				System.out.println(nation + "의 인구는 " + a); 
		}
		scanner.close();
	}
}
