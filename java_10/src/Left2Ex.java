import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Left2Ex extends JFrame {
	public Left2Ex() {
		setTitle("Left 키로 문자열 이동");  //프레임의 타이틀 달기
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); //평소엔 love java
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel a = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(a.getText()); //StringBuffer 사용
					String x = text.substring(0,1);
					String y = text.substring(1);
					a.setText(y.concat(x)); //left할때마다 왼쪽으로 글씨가 이동
				}
			}
		});
		c.add(label);
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
	}
			
	static public void main(String [] args) {
		new Left2Ex();
	}
}
