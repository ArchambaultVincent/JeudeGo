package Data;
/**
 * @author Vincent
 *
 */
public class Stone {
	private String color;
	private int axisX;
	private int axisY;
	private boolean dead;
	public  Stone(String color,int axisX,int axisY, boolean dead){
			this.color=color;
			this.axisX=axisX;
			this.axisY=axisY;
			this.dead=dead;
		}
	public String getColor() {
		return color;
		}
	public void setColor(String color) {
		this.color = color;
		}
	public int getAxisX() {
		return axisX;
	}
	public void setAxisX(int axisX) {
		this.axisX = axisX;
	}
	public int getAxisY() {
		return axisY;
	}
	public void setAxisY(int axisY) {
		this.axisY = axisY;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}

}




