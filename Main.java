package breakout;

import javax.swing.JFrame;

public class Main {
	
	public static int WIDTH = 708;
	public static int HEIGHT = 600;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Gameplay gameplay = new Gameplay();
		frame.setBounds(10, 10, WIDTH, HEIGHT);
		frame.setTitle("Breakout Clone");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gameplay);
	}

}
