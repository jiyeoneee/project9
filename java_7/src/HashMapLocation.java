import java.util.*;

public class HashMapLocation {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("도시,경도,위도를 입력하세요");
		for (int i=0; i<4; i++) { //4번까지 반복
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String nation = st.nextToken().trim();
			int a= Integer.parseInt(st.nextToken().trim());
			int b= Integer.parseInt(st.nextToken().trim());
			
			Location location = new Location(nation, a, b);
			dept.put(nation, location); //해시맵에 저장
		}			
	}
	
	private void printAll() { //국가에 대한 정보 나타냄
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String nation = it.next(); // 국가이름
			Location location = dept.get(nation);
			System.out.println(location.getNation() + "  " + location.getA() + "  "+ location.getB());
		}		
	}
	private void processQuery() { //검색
		while(true) {
			System.out.print("도시 이름 >> ");
			String nation = scanner.nextLine(); // 도시 이름 입력
			if(nation.equals("그만"))
				return; // 종료
			
			Location location = dept.get(nation); // 해시맵에서 나라를 키로 검색
			if(location == null) { // 나라가 해시맵에 없다면
				System.out.println(nation + "는 없습니다.");
			}
			else { 
				System.out.println(location.getNation() + "  " + location.getA() + "  "+ location.getB());
			}
		}
	}
	public void run() {
		read();
		System.out.println("---------------------------");
		printAll();
		System.out.println("---------------------------");
		processQuery();
	}
	public static void main (String[] args) {
		HashMapLocation info = new HashMapLocation();
		info.run();
	}
}
