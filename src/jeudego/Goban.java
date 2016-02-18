package jeudego;
import java.util.ArrayList;

import Data.Stone;
/**
 * @author Vincent
 *
 */
public class Goban {
	private int size;
	private int turn=0;
	private Stone[][] goban;
	private int[][] type; 	
	private ArrayList<Stone[][]> Historic;	
	public Goban(int size){
		this.size=size;
		goban=new Stone[size][size];
		type=new int[size][size];
		for(int index=0; index<size ; index++){
			for(int index2=0;index2<size;index2++){
				type[index][index2]=0;
				goban[index][index2]=null;
			}
		}
	}	
	public Stone[][] getGoban() {
		return goban;
	}
	public int[][] getType() {
		return type;
	}
	/**
	 * put a Stone on the goban 
	 * save the move
	 * increase number of turn 
	 * @param goban
	 * @param stone
	 */
	public void putStone(Stone[][] goban,Stone stone){
		goban[stone.getAxisX()][stone.getAxisY()]=stone;
		Historic.add(goban);
		turn++;
	}
	/**
	 * rewind a movement
	 * @param goban
	 * @param x
	 * @param y
	 */
	public void Rewind(Stone[][] goban){
		goban=Historic.get(turn);
		Historic.remove(turn);	
		turn--;
	}
	/**
	 * remove a stone 
	 * @param goban
	 * @param x
	 * @param y
	 */
	public void removeStone(Stone[][] goban,int x,int y){
		goban[x][y]= null;
	}
	/**
	 * assign a type on the goban 
	 * @param stone
	 * @param type
	  */
	public void assignType(Stone stone,int[][] type){
		if (stone.getColor().equals("black")){
			type[stone.getAxisX()][stone.getAxisY()]=1;
		}
		else {
			type[stone.getAxisX()][stone.getAxisY()]=2;
		}
	}
	/**
	 * remove a element with the rewind 
	 * @param stone
	 * @param type
	 */
	public void removeType(Stone stone,int[][] type ){
	type[stone.getAxisX()][stone.getAxisY()]=0;	
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

