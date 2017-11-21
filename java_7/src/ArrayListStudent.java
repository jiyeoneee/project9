import java.util.*;
public class ArrayListStudent {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<StudentEx> dept = new ArrayList<StudentEx>();
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요."); //입력값
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim());
			double grade = Double.parseDouble(st.nextToken().trim());
			
			StudentEx student = new StudentEx(name, department, num, grade);
			dept.add(student); // ArrayList에 저장
		}			
	}
	
	private void printAll() { //printAll() 메소드
		Iterator<StudentEx> it = dept.iterator();
		while (it.hasNext()) {
			StudentEx student = it.next();
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
				return; // 그만 입력시 종료
			
			for(int i=0; i<dept.size(); i++) { 
				StudentEx student = dept.get(i); 
				if(student.getName().equals(name)) { //  이름이 같은 Student 찾음
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDepartment() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			} 
		}
	}
	
	public void run() {
		read();
		System.out.println("---------------------------");
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) { //main 함수
		ArrayListStudent info = new ArrayListStudent();
		info.run();
	}
}