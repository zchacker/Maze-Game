package Maze;

import java.awt.Image;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
  private Scanner m;
	private String Map[] = new String[14];
	private Image grass,wall;
	
	public Map(){
		
		ImageIcon img = new ImageIcon("D://working//Maze Game//src//Maze//grass.png");
		grass = img.getImage();
		img = new ImageIcon("D://working//Maze Game//src//Maze//wall.png");
		wall = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass(){
		return grass;
	}
	
	public Image getWall(){
		return wall;
	}
	
	public String getMap(int x, int y){
		String index = Map[y].substring(x , x + 1);
		return index;
	}
	
	public void openFile(){
		try{
			m = new Scanner(new File("D://working//Maze Game//src//Maze//map.txt"));
		}catch(Exception e){
			System.out.println("Error loading map");
		}
		
	}
	
	public void readFile(){
		while(m.hasNext()){
			for(int i = 0; i < 14; i++){
				Map[i] = m.next();
			}
		}
	}
	
	public void closeFile(){
		m.close();
	}

}
