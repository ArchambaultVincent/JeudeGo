package jeudego;

import Data.Stone;

public interface Captureinterface {
 void Dead(Stone[][] goban , int free ,int x, int y);
 void Colorsnext (int[][] type , int x , int y , int size,Stone[][] goban,int free);
 int Freestone (int[][] type , int x , int y ,int size,int free);
 void undead (Stone[][] goban, int size);
}
