package jeudego;

import Data.Stone;

public class Capture implements Captureinterface{
	/**
	 * check if the Stone is dead or not 
	 * @param goban
	 * @param free
	 * @param x
	 * @param y
	 */
	public void Dead(Stone[][] goban , int free ,int x, int y){
		if (free == 4){
			goban[x][y].setDead(true);
			}
		else{
			goban[x][y].setDead(false);
		}
	}	
	/**
	 * check if the Stone is the same color
	 * @param type
	 * @param x
	 * @param y
	 * @param size
	 * @param goban
	 * @param free
	 */
	public void Colorsnext (int[][] type , int x , int y , int size,Stone[][] goban,int free){
		}
	/**
	 * calculation number of case free 
	 * @param type
	 * @param x
	 * @param y
	 * @param	 size
	 * @return number of case free;
	 */
	public int Freestone (int[][] type , int x , int y ,int size,int free){
		free=0;
		if(x < size-1){
			if(type[x-1][y] > 0){
				free++;
				}
			}
		else{
			free++;
		}		
		if(x == 0){
			if(type[x+1][y] > 0){
				free++;
				}
			}
		else{
			free++;
		}		
		if(y < size-1){	if(type[x][y-1] > 0){
				free++;
				}
			}
		else{
			free++;
		}		
		if(y == 0){
			if(type[x][y+1] > 0){
				free++;
				}
			}
		else{
			free++;
		}		
	return free;	
	}
	/**
	 * cancel dead action 
	 * @param goban
	 * @param size
	 */
	public void undead (Stone[][] goban, int size){
		int index; 
		int index2;
		for (index=0 ; index < size ; index++){
			for(index2=0 ; index2 < size ; index2++){
				if(goban[index][index2] != null && goban[index][index2].isDead()== true ){
					goban[index][index2].setDead(false);
				}
			}
		}
	}
	/**
	 *Capture systeme
	 * @param type
	 * @param x
	 * @param y
	 * @param size
	 * @param stone
	 */
		public void Catch(int[][] type,int x ,int y , int  size,Stone stone){
		
	}
}
