package learn_java;

import java.awt.*
import javax.swing.*;


public class JFrame_Emp extends JFrame {
	public void CreateJFrame(String title) {
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("这是一个JFrame的窗体");
		
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200, 150);
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JFrame_Emp jf_emp = new JFrame_Emp().CreateJFrame("创建一个JFrame窗体");
		//jf_emp.show();
		new JFrame_Emp().CreateJFrame("创建一个JFrame窗体");
		
	}

}
