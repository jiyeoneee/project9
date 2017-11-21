import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftEx extends JFrame {
	public LeftEx() {
		setTitle("Left 키로 문자열 교체");  //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); 
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override //오버라이딩
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(la.getText());
					la.setText(text.reverse().toString());
				}
			} // left 누를때마다 글자가 뒤집힘
		});
		c.add(label);
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true); 
		label.requestFocus();// 키 입력 포커스 지정 
	}
	static public void main(String [] args) {
		new LeftEx();
	}
}