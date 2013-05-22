package Maze;

import java.awt.*;
import javax.swing.*;

public class Player {
  
	private int tileX,tileY;
	private Image player;
	
	public Player(){
		
		ImageIcon img = new ImageIcon("D://working//Maze Game//src//Maze//smile.jpg");
		player = img.getImage();

		
		tileX = 1;
		tileY = 1;
	}
	
	public Image getplayer(){
		return player;
	}
	
	
	public int getTileX(){
		return tileX;
	}
	
	public int getTileY(){
		return tileY;
	}
	
	
	public void move(int dx,int dy){
		
		tileX += dx;
		tileY += dy;
	}
}
