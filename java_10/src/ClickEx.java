import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickEx extends JFrame {
	public ClickEx() {
		super("클릭 연습 용 응용프로그램");  //프레임의 타이틀 달기
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		JLabel label = new JLabel("C");
		label.setLocation(100,100); //j label 초기 위치
		label.setSize(20, 20);
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				int xBound = c.getWidth() - la.getWidth(); 
				int yBound = c.getHeight() - la.getHeight(); 			
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);		//랜덤함수 사용		
				la.setLocation(x, y);
			} //마우스 클릭할 때마다 랜덤으로 이동
		});
		add(label);
		setSize(300,300); //(300,300)사이즈
		setVisible(true);
	}
	static public void main(String [] args) {
		new ClickEx();
	}
}
