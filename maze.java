package Maze;

import javax.swing.JFrame;

public class maze {
  public static void main(String args[]){
		new maze();
	}
	
	public maze(){
		JFrame f = new JFrame();
		f.setTitle("Maze Game");
		f.add(new Board());
		f.setSize(464, 485);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
