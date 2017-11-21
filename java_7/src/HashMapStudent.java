import java.util.*;
public class HashMapStudent {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, StudentEx> dept = new HashMap<String, StudentEx>();
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim());
			double grade = Double.parseDouble(st.nextToken().trim());
			
			StudentEx student = new StudentEx(name, department, num, grade);
			dept.put(name, student); //해시맵에 저장
		}			
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); // 이름 알아냄
			StudentEx student = dept.get(name); // 이름을 키로하여 해시맵으로 Student 객체 얻어냄
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getDepartment());
			System.out.println("학번:" + student.getNum());
			System.out.println("학점평균:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			StudentEx student = dept.get(name); // 해시맵에서 이름을 키로 검색
			if(student == null) { // 이름이 해시맵에 없다면
				System.out.println(name + " 학생 없습니다.");
			}
			else { // 해시맵에서 검색된  Student 객체
				System.out.print(student.getName() + ", ");
				System.out.print(student.getDepartment() + ", ");
				System.out.print(student.getNum() + ", ");
				System.out.println(student.getGrade());
			}
		}
	}
	
	public void run() {
		read();
		System.out.println("---------------------------");
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) {
		HashMapStudent info = new HashMapStudent();
		info.run();
	}
}
