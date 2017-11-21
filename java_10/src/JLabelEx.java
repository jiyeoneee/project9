import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelEx extends JFrame {
	public JLabelEx() {
		setTitle("마우스 올리기 내리기");			//프레임의 타이틀 달기
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		
		JLabel label = new JLabel("Love Java");
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("Love Java"); //마우스를 올릴 시
			}
			public void mouseExited(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("사랑해"); //마우스를 내릴 시
			}			
		});
		add(label);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new JLabelEx();
	}
}