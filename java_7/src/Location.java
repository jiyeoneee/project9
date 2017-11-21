public class Location { //Location 클래스에 대해 필드
	private String nation;
	private int a;
	private int b;
	
	public Location(String nation, int a, int b) { //기본생성자 설정
		this.nation = nation;
		this.a = a;
		this.b = b;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNation() {
		return nation;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return b;
	}
}