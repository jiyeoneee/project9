import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSize extends JFrame {
	public FontSize() {
		setTitle("+,-키로 폰트 크기 조절");  //프레임의 타이틀 달기
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java"); //기본은 love java
		c.add(la);
		
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') { //+ 누를시 글씨크기 증가
					JLabel a = (JLabel)e.getSource();
					Font f = a.getFont();
					int size = f.getSize();
					a.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				if(e.getKeyChar() == '-') { //- 누를시 글씨 크기 감소
					JLabel a = (JLabel)e.getSource();
					Font f = a.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					a.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(400,200); //(400,200) 화면 출력
		setVisible(true);
		
		la.setFocusable(true); 
		la.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
			
	static public void main(String [] args) {
		new FontSize();
	}
}