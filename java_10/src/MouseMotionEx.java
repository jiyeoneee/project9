import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionEx extends JFrame {
	public MouseMotionEx() {
		setTitle("드래깅동안 YELLOW");	 //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//배경색 green
		MyMouseListener a = new MyMouseListener();
		c.addMouseMotionListener(a);
		c.addMouseListener(a);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW); //드래그 시 yellow
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN); //마우스 이동시 green
		}		
	}
	static public void main(String [] args) {
		new MouseMotionEx();
	}
}