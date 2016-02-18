package Data;
/**
 * @author Vincent
 *
 */
public class Player {
private String color;
private String name;
private float score;
private boolean human;
public Player (String color, String name, float score , boolean human ){
this.color=color;
this.name=name;
this.score=score;
this.human=human;
}
public String getColor() {
	return color;
}
public String getName() {
	return name;
}
public float getScore() {
	return score;
}
public boolean isHuman() {
	return human;
}

}

